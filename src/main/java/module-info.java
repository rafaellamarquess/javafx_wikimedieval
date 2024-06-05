module org.example.wikimedievalsenac {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;
    requires java.desktop;


    opens org.example.wikimedievalsenac to javafx.fxml;
    exports org.example.wikimedievalsenac;
    opens org.example.wikimedievalsenac.Controllers to javafx.fxml;
}