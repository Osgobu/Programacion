package PACMAN;

public class pacman;
    #buscar atributos 
    private int puntuacion;
    private int ancho;
    private int altura;
    private direccion;
    private int vidas;
    private int x;
    private int y;

    public void move();{
        //Quiero comprobar si esta en la izquierda para empezar des de la derecha 
        if (x<1 && y>310){
            setx(1)
            sety(310)
        }

    }

    public void pickupBola();{
        //Quiero que cuando se coma una bola sue a la puntuacion
        puntuacion = puntuacion +1
        System.out.println("Puntuacion:" puntuacion)
    }



