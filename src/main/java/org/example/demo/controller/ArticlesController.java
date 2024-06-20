package org.example.demo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.example.demo.entity.Articles;
import org.example.demo.repository.MySQLRepository;

public class ArticlesController {
    @FXML
    private TextField title;
    @FXML
    private TextField describe1;
    @FXML
    private TextField content;
    @FXML
    protected void action() {
        String newTitle = title.getText();
        String describe = describe1.getText();
        String newContent = content.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmation");
        alert.show();
/*        MySQLRepository repo = new MySQLRepository();
        Articles articles = new org.example.demo.entity.Articles(newTitle, describe, newContent);
        repo.saveArticles(articles);*/
        reset();
    }
    @FXML
    protected void reset(){
        title.clear();
        describe1.clear();
        content.clear();

    }

}
