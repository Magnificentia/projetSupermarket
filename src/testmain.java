/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author _Nprime496_
 */
public class testmain extends Application {
    /*
    
    ceci est un main de test, il a pour but de pouvoir tester vos vues sans interferer avec le reste de l' application
    il suffit de mentionner le chemin de votre vue pour tester que tout va bien, les parametres
    de connection a la bd seront dans le code en dur, il n'y a pas besoin de s'y interresser
    */
    
    @Override
    public void start(Stage primaryStage) throws IOException {

        StackPane root = new StackPane();
        
        //LA ZONE A MODIFIER, changer le chemin 
        
        String chemin="testview/testview.fxml";//il faut changer cette variable pour qu'elle corresponde à votre vue
        Pane p=FXMLLoader.load(ProjetBd.class.getResource("/views/"+chemin));
        root.getChildren().add(p);
        Scene scene = new Scene(root, 300, 250);
        
        //FINZONE
        
        primaryStage.setTitle("Pane de test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
