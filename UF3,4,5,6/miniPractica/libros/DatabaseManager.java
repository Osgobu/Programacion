package com.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.database.models.Llibre;

public class DatabaseManager
{
    private Connection connection;

    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://172.17.0.2:5432/student", "postgres", "mysecretpassword");
            System.out.println("Connexio establerta.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Student getLlibre(int id) {
        String query = "SELECT * FROM students WHERE id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Student(rs.getInt("id"), rs.getString("Titol"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void addLlibre(Llibre llibre) {
        String query = "INSERT INTO students (id, first_name, last_name) VALUES (?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);

            stmt.setInt(1, llibre.getId());
            stmt.setString(2, llibre.getTitol());
            stmt.executeUpdate();
            System.out.println("Llibre afegit.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateLlibre(Llibre llibre) {
        String query = "UPDATE llibres SET first_name = ?, WHERE id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);

            stmt.setString(1, student.getName());
            stmt.setString(2, student.getLastName());
            stmt.setInt(3, student.getId());
            stmt.executeUpdate();
            System.out.println("Estudiant modificat.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        String query = "DELETE FROM students WHERE id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Estudiant eliminat.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connexio tancada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}