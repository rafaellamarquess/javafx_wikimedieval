package org.example.wikimedievalsenac.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField senhaField;

    @FXML
    protected void handlebuttonLogin() {
        String email = emailField.getText();
        String senha = senhaField.getText();
        // Aqui você pode adicionar a lógica de autenticação
        System.out.println("Tentando login com email: " + email + " e senha: " + senha);
    }

    @FXML
    protected void handlebuttonRegister() {
        // Lógica para registrar um novo usuário
        System.out.println("Registrando um novo usuário");
    }
}

