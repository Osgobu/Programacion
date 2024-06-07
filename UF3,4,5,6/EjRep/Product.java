
package EjRep;

class Product{
    int id;
    String nom;
    double preu;

    public Product(int id, String nom, double preu){
        this.id = id;
        this.nom = nom;
        this.preu = preu;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom(){
        return nom;
    }

    public void setPreu(double preu){
        this.preu = preu;
    }

    public double getPreu(){
        return preu;
    }

    @Override
    
    public String toString() {
        return "Producte: " + nom + " Preu: " + preu; 
    }

}