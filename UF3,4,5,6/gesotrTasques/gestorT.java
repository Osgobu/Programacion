import java.io.*;
import java.io.File;
import java.io.IOException;

class File {
    public static void main(String[] args) {

        // Aqui se crea un fichero con datos
        File file = new File("Nomdelteuficher.txt del ficher que vols modificar");
        try {
            // Comprovem si el fitxer ja existeix
            if (file.createNewFile()) {
                System.out.println("Fitxer creat");
            } else {
                System.out.println("El fitxer ja existeix");
            }
        } catch (IOException e) {
            System.out.println("S'ha produït un error en crear el fitxer");
            e.printStackTrace();
        }


        // Sirve para escribir datos en el fichero
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Titol\n");
            writer.write("Descripcio\n");
            writer.write("Data de venciment\n");
            writer.write("Estat(pendent, en curs, completada)\n");
            System.out.println("Dades escrites al fitxer.");
        } catch (IOException e) {
            System.out.println("S'ha produït un error en escriure al fitxer.");
            e.printStackTrace();
        }


        // Lee los datos del fichero 
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Dades llegides del fitxer:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("S'ha produït un error en llegir el fitxer");
            e.printStackTrace();
        }


        // Para eliminar el fichero que queramos
        if (file.delete()) {
            System.out.println("Fitxer eliminat amb èxit");
        } else {
            System.out.println("No s'ha pogut eliminar el fitxer.");
        }

        // Aquí pots afegir y modificar el contingut del fitxer
        File fileToModify = new File("Nomdelficher.txt que vols modificar");
        if (fileToModify.exists()) {
            System.out.println("Fitxer modificat amb èxit.");
        } else {
            System.out.println("El fitxer a modificar no existeix");
        }
    }
}


