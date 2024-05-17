import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Lebel;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

@Override 

public void start (Stage primarystage) { 
    
    primaryStage. setTitle("Aplicació de Salutacio"); 
    
    Button bsalutacio = new Button ("Clica aquí"); 
    
    btnSalutacio. setOnAction(e -> mostrarMissatgeSalutacio()); 
    
    StackPane root = new StackPane (bsalutacio); 
    
    Scene scene = new Scene (root, 300, 250); primaryStage. setscene(scene) ; 
    
    primaryStage. show(); private void mostrarMissatgeSalutacio() { 
        
        Stage stage = new Stage(); stage. setTitle("Missatge de Salutac16"); 
