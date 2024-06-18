package org.example.wikimedievalsenac.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.wikimedievalsenac.HelloApplication;

import java.io.IOException;
import java.util.Objects;


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
    protected void handleBuscaMidia() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/wikimedievalsenac/view/busca_midias.fxml")));
        stage.setTitle("busca_midia");
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    protected void handleLogin() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org/example/wikimedievalsenac/view/login.fxml")));
        stage.setTitle("login");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    protected void handleSearch() throws IOException {
        String searchTerm = searchField.getText();
        //Redireciona para o resultado da pesquisa
        System.out.println("Pesquisando por: " + searchTerm);
        HelloApplication.setRoot("search");

    }

}