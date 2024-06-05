package org.example.wikimedievalsenac.Controllers;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VisualizacaoMidiaController extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Visualização Detalhada de Mídia");

        // Campos de detalhes da mídia
        Label tituloLabel = new Label("Título:");
        Label autorDiretorLabel = new Label("Autor/Diretor:");
        Label anoLabel = new Label("Ano de Lançamento:");
        Label classificacaoLabel = new Label("Classificação:");
        Label sinopseLabel = new Label("Sinopse:");

        Label tituloValue = new Label("O Senhor dos Anéis");
        Label autorDiretorValue = new Label("J.R.R. Tolkien");
        Label anoValue = new Label("1954");
        Label classificacaoValue = new Label("5 estrelas");
        Label sinopseValue = new Label("Uma história de aventura na Terra Média.");

        // Layout para os detalhes da mídia
        GridPane layoutDetalhes = new GridPane();
        layoutDetalhes.setPadding(new Insets(10));
        layoutDetalhes.setVgap(8);
        layoutDetalhes.setHgap(10);
        GridPane.setConstraints(tituloLabel, 0, 0);
        GridPane.setConstraints(autorDiretorLabel, 0, 1);
        GridPane.setConstraints(anoLabel, 0, 2);
        GridPane.setConstraints(classificacaoLabel, 0, 3);
        GridPane.setConstraints(sinopseLabel, 0, 4);
        GridPane.setConstraints(tituloValue, 1, 0);
        GridPane.setConstraints(autorDiretorValue, 1, 1);
        GridPane.setConstraints(anoValue, 1, 2);
        GridPane.setConstraints(classificacaoValue, 1, 3);
        GridPane.setConstraints(sinopseValue, 1, 4);
        layoutDetalhes.getChildren().addAll(tituloLabel, autorDiretorLabel, anoLabel, classificacaoLabel, sinopseLabel,
                tituloValue, autorDiretorValue, anoValue, classificacaoValue, sinopseValue);

        // Criar uma cena para a visualização detalhada
        Scene cenaDetalhes = new Scene(layoutDetalhes, 400, 200);

        // Mostrar a cena de visualização detalhada
        primaryStage.setScene(cenaDetalhes);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
