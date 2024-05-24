public class robot{
    //nombre para identificar el robot le ponemos un atributo al robot
    private String nombre;
    //constructor 
    public robot(String nombre);

    //Mover el robot hacia adelante
    public void moveForward(){
        System.out.println(nombre + "Se mueve hacia adelante");
    }
    //Mover el robot hacia atras
    public void moveBackward(){
        System.out.println(nombre + "Se mueve hacie atras");
    }
    //Mover el robot para que se gire hacia la izquierda
    public void moveLeft(){
        System.out.println(nombre + "Se esta girando a la izquierda");
    }
    //Mover el robot para que se gire hacia la derecha
    public void moveRight(){
        System.out.println(nombre + "Se esta girando a la derecha");
    }
}

