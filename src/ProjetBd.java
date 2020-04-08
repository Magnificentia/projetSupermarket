/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.jfoenix.controls.JFXTabPane;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author _Nprime496_
 */
public class ProjetBd extends Application {
    private JFXTabPane menus;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        menus=new JFXTabPane();
        
        Pane p=FXMLLoader.load(ProjetBd.class.getResource("/views/testview/testview.fxml"));
        Tab d=new Tab("acceuil",p);
        Tab f=new Tab("produit");
        Tab e=new Tab("A propos");
        menus.getTabs().addAll(d,e,f);
        StackPane root = new StackPane();
        root.getChildren().add(menus);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
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
