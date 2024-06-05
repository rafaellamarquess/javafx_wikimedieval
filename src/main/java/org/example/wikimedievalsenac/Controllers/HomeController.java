package org.example.wikimedievalsenac.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.wikimedievalsenac.HelloApplication;

import java.io.IOException;


public class HomeController {

    public HomeController() {
    }

    @FXML
    private TextField searchField;


    @FXML
    protected void handleHome() throws IOException {
        HelloApplication.setRoot("home");
        System.out.println("Permanece na página inicial");

    }

    @FXML
    public void handleContact() throws IOException {
        HelloApplication.setRoot("contato");
        System.out.println("Contato");
    }

    @FXML
    protected void handleExplorar() throws IOException {
        HelloApplication.setRoot("explorar");
        System.out.println("explorar");
    }
    @FXML
    protected void handleLogin() throws IOException {
        HelloApplication.setRoot("login");
        System.out.println("login");
    }


    @FXML
    protected void handleSearch() throws IOException {
        String searchTerm = searchField.getText();
        //Redireciona para o resultado da pesquisa
        System.out.println("Pesquisando por: " + searchTerm);
        HelloApplication.setRoot("busca_midias");

    }

}