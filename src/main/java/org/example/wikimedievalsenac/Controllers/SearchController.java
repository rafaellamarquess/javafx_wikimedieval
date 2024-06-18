package org.example.wikimedievalsenac.Controllers;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.wikimedievalsenac.HelloApplication;
import java.io.IOException;


public abstract class SearchController extends Application {

    public SearchController() {

    }

    @FXML
    private TextField searchField;

    @FXML
    protected void handleSearch() throws IOException {
        String searchTerm = searchField.getText();
        // Redireciona para a página de resultado da pesquisa
        System.out.println("Pesquisando por: " + searchTerm);
        HelloApplication.setRoot("resultado_pesquisa");
    }

}
