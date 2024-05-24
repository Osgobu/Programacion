import javax.swing.*


//Esta clas ees para que muestre en pantalla una ventana del panel 
public class RobotInterficie extends JFrame {
    privte Robot robot;
    //Constructor de la clase
    public RobotInterficie(){
        robot =new Robot("Robocop");

        //Titulo como el del ejercicio en la ventana que se abrira y tamaño
        setTitle("Control de Robot");
        setSize(200,150);
    }
    
}