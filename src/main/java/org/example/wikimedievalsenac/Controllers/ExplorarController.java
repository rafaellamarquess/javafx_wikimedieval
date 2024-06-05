package org.example.wikimedievalsenac.Controllers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ExplorarController extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Busca de Mídias");

        // Campos de busca
        TextField campoBusca = new TextField();
        campoBusca.setPromptText("Digite sua busca");
        Button botaoBuscar = new Button("Buscar");

        // Layout para a busca
        GridPane layoutBusca = new GridPane();
        layoutBusca.setPadding(new Insets(10));
        layoutBusca.setVgap(8);
        layoutBusca.setHgap(10);
        GridPane.setConstraints(campoBusca, 0, 0);
        GridPane.setConstraints(botaoBuscar, 1, 0);
        layoutBusca.getChildren().addAll(campoBusca, botaoBuscar);

        // Lista de resultados da busca
        ListView<String> listaResultados = new ListView<>();

        // Layout para exibir os resultados
        GridPane layoutResultados = new GridPane();
        layoutResultados.setPadding(new Insets(10));
        layoutResultados.setVgap(8);
        layoutResultados.setHgap(10);
        GridPane.setConstraints(listaResultados, 0, 0);
        layoutResultados.getChildren().add(listaResultados);

        // Criar uma cena para a busca
        Scene cenaBusca = new Scene(layoutBusca, 300, 100);

        // Criar uma cena para exibir os resultados
        Scene cenaResultados = new Scene(layoutResultados, 300, 300);

        // Mostrar a cena de busca por padrão
        primaryStage.setScene(cenaBusca);

        // Ação do botão de busca
        botaoBuscar.setOnAction(e -> {
            // Simulando uma busca (você deve substituir por sua lógica real de busca)
            String termoBusca = campoBusca.getText();
            listaResultados.getItems().clear(); // Limpar resultados anteriores
            listaResultados.getItems().addAll(
                    "Resultado 1 para '" + termoBusca + "'",
                    "Resultado 2 para '" + termoBusca + "'",
                    "Resultado 3 para '" + termoBusca + "'"
            );
            // Alternar para a cena de resultados
            primaryStage.setScene(cenaResultados);
        });

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
