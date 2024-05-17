import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Finestra{
    public static void main(String[] args){
        JFrame frame = new JFrame("Finestra d'exemple");
        JButton button = new JButton("Clic aqui");
        JTextField pantallita=new JTextField();
        JButton[] numberButtons= new JButton[10];

        for(int i=0 ; i <numberButtons.length; i++){
            numberButtons[i]= new JButton(Integer.toString(i));
        }
        pantallita.setEditable(false);
        
        frame.add(pantallita);

        frame.setSize(300,200);
        for (JButton jButton: numberButtons){
            frame.add(jButton);
            frame.setLayout(new GridLayout(4,3));
            }
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}