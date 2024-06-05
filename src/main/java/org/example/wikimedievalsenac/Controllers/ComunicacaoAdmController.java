package org.example.wikimedievalsenac.Controllers;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ComunicacaoAdmController extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Comunicação com Administradores");

        // Campos para relatar problemas ou fazer sugestões
        Label assuntoLabel = new Label("Assunto:");
        Label mensagemLabel = new Label("Mensagem:");

        TextField assuntoInput = new TextField();
        TextArea mensagemInput = new TextArea();

        // Layout para relatar problemas ou fazer sugestões
        GridPane layoutComunicacao = new GridPane();
        layoutComunicacao.setPadding(new Insets(10));
        layoutComunicacao.setVgap(8);
        layoutComunicacao.setHgap(10);
        GridPane.setConstraints(assuntoLabel, 0, 0);
        GridPane.setConstraints(mensagemLabel, 0, 1);
        GridPane.setConstraints(assuntoInput, 1, 0);
        GridPane.setConstraints(mensagemInput, 1, 1);
        layoutComunicacao.getChildren().addAll(assuntoLabel, mensagemLabel, assuntoInput, mensagemInput);

        // Botão para enviar mensagem aos administradores
        Button enviarButton = new Button("Enviar");
        GridPane.setConstraints(enviarButton, 1, 2);
        layoutComunicacao.getChildren().add(enviarButton);

        // Criar uma cena para a comunicação com os administradores
        Scene cenaComunicacao = new Scene(layoutComunicacao, 400, 250);

        // Mostrar a cena de comunicação com os administradores
        primaryStage.setScene(cenaComunicacao);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
