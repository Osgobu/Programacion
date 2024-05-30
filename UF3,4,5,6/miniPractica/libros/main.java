package com.example.database;

import com.example.database.models.Student;

public class Main
{
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        dbManager.connect();

        // Crear un nou llibre
        Llibre llibre = new Llibre(1,"Juan el demonio");
        dbManager.addStudent(student);

        // Recuperar llibre
        Llibre retrievedLlibre = dbManager.getLlibre(1);
        System.out.println(retrievedLlibre);

        // Actualiztzar llibre
        llibre.setLastName("HOla");
        dbManager.updateLlibre(llibre);

        // Eliminar llibre
        dbManager.deleteLlibre(1);

        dbManager.disconnect();
    }
}