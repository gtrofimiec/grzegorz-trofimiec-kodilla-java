package com.kodilla.mygame;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import static javafx.scene.paint.Color.BLACK;

public class TheGame extends Application {
    //private Image imageback = new Image("file:src/main/resources/table.png");
    private Image table = new Image("file:src/main/resources/table.png",
            700,700,true,true);
    private Image dice = new Image("file:src/main/resources/dice.png",
            100,100,true,true);
    private FlowPane rootTable = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane rootDice = new FlowPane(Orientation.VERTICAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridTable = new GridPane();
        gridTable.setAlignment(Pos.BASELINE_LEFT);
        gridTable.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));

        ImageView imgTable = new ImageView(table);
        rootTable.getChildren().add(imgTable);

        ImageView imgDice = new ImageView(dice);
        imgDice.setFitHeight(100);
        imgDice.setFitWidth(100);
        rootDice.getChildren().add(imgDice);

        gridTable.add(rootTable, 0, 0, 3, 1);
        gridTable.add(rootDice, 0, 0, 3, 1);

        Scene scene = new Scene(gridTable, 1000, 800, BLACK);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Chinczyk");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
