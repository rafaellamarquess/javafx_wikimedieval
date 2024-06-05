package org.example.wikimedievalsenac.Controllers;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public abstract class SearchController extends Application {

    public SearchController() {

    }

    @FXML
    private TextField searchField;
    @FXML
    private ListView<String> resultadoListView;

    @FXML
    protected void handleSearch() {
        String searchTerm = searchField.getText();
        // Adicione a lógica de busca aqui
        System.out.println("Buscando por: " + searchTerm);
        // Exemplo de resultado
        resultadoListView.getItems().add("Resultado para: " + searchTerm);
    }

}
