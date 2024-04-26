package Codificacio;

    public class media {

      private String nom;
      private String autor;
      private int duradaSegons;

      public media (String oscar, String oscar1, int ds) {
        nom = oscar;
        autor = oscar1;
        duradaSegons = ds;
      }

      public String getNom() {
        return nom;
      }

      public String getAutor() {
        return autor;
      }

      public int getDurada() {
        return duradaSegons;
      }

      public void setNom(String oscar) {
        nom = oscar;
      }

      public void setAutor(String oscar1) {
        autor = oscar1;
      }

      public void setDurada(int ds) {
        duradaSegons = ds;
      }

    }
