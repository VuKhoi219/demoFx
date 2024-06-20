package org.example.demo.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.demo.entity.Articles;

public class ViewController {
    @FXML
    private TableView<Articles> tableView;
    @FXML
    private TableColumn<Articles,String> id;
    @FXML
    private TableColumn<Articles,String> title;
    @FXML
    private TableColumn<Articles,String> des ;
    @FXML
    private TableColumn<Articles,String> content;

    @FXML
    public void initialize() {
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        des.setCellValueFactory(new PropertyValueFactory<>("des"));
        content.setCellValueFactory(new PropertyValueFactory<>("content"));

        ObservableList<Articles> data = FXCollections.observableArrayList(
                new Articles(1, "Khôi", "Khôi đẹp trai", "Khôi đẹp trai nhất thế giới")
        );
        tableView.setItems(data);
    }
}
