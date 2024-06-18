package org.example.wikimedievalsenac.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.example.wikimedievalsenac.HelloApplication;

import java.io.IOException;

public class BuscaMidiasController {

    @FXML
    private TextField searchField;
    @FXML
    private ListView<String> resultadoListView;

    @FXML
    protected void handleBusca() throws IOException {
        HelloApplication.setRoot("busca_midias");
    }

    @FXML
    protected void handleButtonBusca() {
        String searchTerm = searchField.getText();
        // Adicione aqui a lógica para buscar mídias com base no termo de pesquisa
        System.out.println("Buscando por: " + searchTerm);
        // Exemplo de adicionar resultados à ListView
        resultadoListView.getItems().add("Resultado para: " + searchTerm);
    }
}
