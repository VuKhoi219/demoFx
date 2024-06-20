module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens org.example.demo to javafx.graphics, javafx.fxml;
    opens org.example.demo.controller to javafx.graphics,javafx.fxml;
    exports org.example.demo;
    exports org.example.demo.controller;
}