import javax.swing.*


//Esta clas ees para que muestre en pantalla una ventana del panel 
public class RobotInterficie extends JFrame {
    privte Robot robot(){
        
    }

    //Constructor de la clase
    public RobotInterficie(){
        robot =new Robot("Robocop");

        //Titulo como el del ejercicio en la ventana que se abrira y tamaño
        setTitle("Control de Robot");
        setSize(200,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Estamoa haciendo que el layout de nuestro panel sea de 3*2
        Jpanel panel = new JPanel();
        pnael.setLayout(new GridLayout(3,2));

    }
    
}