
public class Item { 
    private int id; 
    private String nom; 
    private String tipus; 
    private double valor; 
    private double pes; 
    public Item(int id, String nom, String tipus, double valor, double pes) { 
        this.id = id; 
        this.nom = nom; 
        this.tipus = tipus; 
        this.valor = valor; 
        this.pes = pes; 
    } 
        
        public int getId() { 
            return id; 
        } 
            
        public String getNom() { 
            return nom; 
        } 
        
        public String getTipus() { 
            return tipus; 
        } 
        
        public double getValor() { 
            return valor; 
        } 
        
        public double getPes() { 
            return pes; 
        } 
        
        @Override 
        public String toString() { 
            return "ID: " + id + ", Nom: " + nom + ", Tipus: " + tipus + ", Valor: " + valor + " or, Pes: " + pes; 
        } 
}