package org.example.wikimedievalsenac;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Scene scene;
    private static Stage stage;
    private static Parent root;

    @Override
    public void start(Stage primaryStage) throws IOException {
        scene = new Scene(loadFXML("home"));
        primaryStage.setScene(scene);
        primaryStage.setTitle("Wiki Medieval");
        primaryStage.show();
    }


    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/org/example/wikimedievalsenac/view/home.fxml"));
        return fxmlLoader.load();
    }


    public static void main(String[] args) {
        launch(args);
    }
}