/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Karan
 */
public class RoView extends Stage{
    private final String NAAM = "Harley Lafeber";
    private final int VGAP = 30;
    
   private final int HGAP = 100;
      private TextField txt1, txt2, txt3;
    private Button btnUp, btnDown;
    //constructer to build the form
    public RoView(){
        this.txt1 = new TextField();
        this.txt2 = new TextField();
        this.txt3 = new TextField();
        
       
        this.btnUp = new Button("up");
        btnUp.setOnAction(new BtnUpHandler());
        
        this.btnDown = new Button("down");
        btnDown.setOnAction(new BtnDownHandler());
        
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setVgap(30);
        pane.setHgap(100);
        pane.add(txt1, 0, 0, 2, 1);
        pane.add(txt2, 0, 1, 2, 1);
        pane.add(txt3, 0, 2, 2, 1);
        pane.add(btnUp, 0, 3);
        pane.add(btnDown, 1, 3);
        
        Scene scene1 = new Scene(pane, 210, 210);
        
        setScene(scene1);
        setTitle("Rotate");
        show();
    }
    //inner class - inwendige klasse
    class BtnUpHandler implements EventHandler <ActionEvent>{
        public void handle(ActionEvent e){
        //String save = txt2.getText();
        //txt2.setText(txt3.getText());
        //txt3.setText(txt1.getText());
        //txt1.setText(save);
        }
            
        
    }
         class BtnDownHandler implements EventHandler <ActionEvent>{
        public void handle(ActionEvent e){
       // String save = txt2.getText();
       // txt2.setText(txt1.getText());
       // txt1.setText(txt3.getText());
       // txt3.setText(save);
        }
            
        
    }
}