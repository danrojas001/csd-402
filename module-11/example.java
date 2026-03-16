//Dan Rojas
//Mod 11.2
//15-Mar-2026


//Example application displaying some HBox and VBox usage.

package com.example.hbox_vbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class example extends Application {

    public void start(Stage stage) throws Exception {
//        Creation of all nodes
        Label label1 = new Label("VBox containing multiple HBoxes");
        Label label2 = new Label("HBox1");
        Label label3 = new Label("HBox2");
        Label label4 = new Label("HBox3");
        Button b1 = new Button("A");
        Button b2 = new Button("B");
        Button b3 = new Button("C");
        Button b4 = new Button("D");
        Button b5 = new Button("E");
        Button b6 = new Button("F");
        Button b7 = new Button("G");
        Button b8 = new Button("H");
        Button b9 = new Button("I");

//        VBox is created to contain multiple HBoxes
        VBox v1 = new VBox();
        v1.setStyle("-fx-border-color: green; -fx-border-width: 5px; -fx-padding: 10; -fx-border-style: solid;");

//        3 HBoxes created with borders to easily identify them and their location within the VBox
        HBox h1 = new HBox();
        h1.setStyle("-fx-border-color: red; -fx-padding: 10; -fx-border-style: solid;");
        HBox h2 = new HBox(10);
        h2.setStyle("-fx-border-color: blue; -fx-padding: 10; -fx-border-style: solid;");
        HBox h3 = new HBox(15);
        h3.setStyle("-fx-border-color: magenta; -fx-padding: 10; -fx-border-style: solid;");

//        Adding label and all HBox nodes to VBox
        v1.getChildren().add(label1);
        v1.getChildren().addAll(h1, h2, h3);

//        Adding nodes to HBox1
        h1.getChildren().add(label2);
        h1.getChildren().add(b1);
        h1.getChildren().add(b2);
        h1.getChildren().add(b3);

//        Adding nodes to and changing position of HBox2
        h2.getChildren().add(label3);
        h2.getChildren().add(b4);
        h2.getChildren().add(b5);
        h2.getChildren().add(b6);
        h2.setAlignment(Pos.TOP_CENTER);

//        Adding nodes, changing position, and setting margins around btn9 of HBox3
        h3.getChildren().add(label4);
        h3.getChildren().add(b7);
        h3.getChildren().add(b8);
        h3.getChildren().add(b9);
        h3.setAlignment(Pos.BOTTOM_RIGHT);
        HBox.setMargin(b9, new Insets(10, 10,10, 10));

        Scene scene1 = new Scene(v1, 750, 500);
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}