package org.example.wikimedievalsenac.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField emailField;
    @FXML
    private PasswordField senhaField;

    public LoginController(TextField emailField, PasswordField senhaField) {
        this.emailField = emailField;
        this.senhaField = senhaField;
    }

    @FXML
    protected void handleLogin() {
        String email = emailField.getText();
        String senha = senhaField.getText();
        // Adicione a lógica de autenticação aqui
        System.out.println("Login com email: " + email);
    }

    @FXML
    protected void handleRegister() {
        String email = emailField.getText();
        String senha = senhaField.getText();
        // Adicione a lógica de registro aqui
        System.out.println("Registro com email: " + email);
    }
}
