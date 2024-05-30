
//clase del llibre en aquest package 
public class Llibre{
    private int id;
    private String titol;

    //constructor per el llibre
    public Llibre(){}

    public Llibre(int id, String titol){
        this.id=id;
        this.titol=titol
    }


    //Coger los gets y los set de los dos elementos 
    public int getId(){return id;}
    public String getTitol(){return titol;}

    public void setId(int id){this.id=id;}
    public void setTitol(String titol){this.titol=titol;}
}

