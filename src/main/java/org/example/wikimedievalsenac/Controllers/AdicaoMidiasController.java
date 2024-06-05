package org.example.wikimedievalsenac.Controllers;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AdicaoMidiasController extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Adição de Novas Mídias");

        // Campos para adicionar nova mídia
        Label tituloLabel = new Label("Título:");
        Label tipoLabel = new Label("Tipo:");
        Label anoLabel = new Label("Ano de Lançamento:");
        Label sinopseLabel = new Label("Sinopse:");

        TextField tituloInput = new TextField();
        ComboBox<String> tipoCombo = new ComboBox<>();
        tipoCombo.getItems().addAll("Livro", "Filme", "VideoGame");
        TextField anoInput = new TextField();
        TextArea sinopseInput = new TextArea();

        // Layout para adicionar nova mídia
        GridPane layoutAdicao = new GridPane();
        layoutAdicao.setPadding(new Insets(10));
        layoutAdicao.setVgap(8);
        layoutAdicao.setHgap(10);
        GridPane.setConstraints(tituloLabel, 0, 0);
        GridPane.setConstraints(tipoLabel, 0, 1);
        GridPane.setConstraints(anoLabel, 0, 2);
        GridPane.setConstraints(sinopseLabel, 0, 3);
        GridPane.setConstraints(tituloInput, 1, 0);
        GridPane.setConstraints(tipoCombo, 1, 1);
        GridPane.setConstraints(anoInput, 1, 2);
        GridPane.setConstraints(sinopseInput, 1, 3);
        layoutAdicao.getChildren().addAll(tituloLabel, tipoLabel, anoLabel, sinopseLabel, tituloInput, tipoCombo, anoInput, sinopseInput);

        // Botão para enviar a nova mídia para revisão
        Button enviarButton = new Button("Enviar para Revisão");
        GridPane.setConstraints(enviarButton, 1, 4);
        layoutAdicao.getChildren().add(enviarButton);

        // Criar uma cena para a adição de mídias
        Scene cenaAdicao = new Scene(layoutAdicao, 400, 250);

        // Mostrar a cena de adição de mídias
        primaryStage.setScene(cenaAdicao);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
