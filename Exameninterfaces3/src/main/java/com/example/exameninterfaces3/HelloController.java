package com.example.exameninterfaces3;

import clases.Coche;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ChoiceBox cModelo;
    @FXML
    private ChoiceBox cCliente;
    @FXML
    private DatePicker cFecha;
    @FXML
    private DatePicker cFechaSalida;
    @FXML
    private Button btnAñadir;
    @FXML
    private Button btnSalir;
    @FXML
    private TableColumn tMatricula;
    @FXML
    private TableColumn tModelo;
    @FXML
    private TableColumn tFechaEntrada;
    @FXML
    private TableColumn tFechaSalida;
    @FXML
    private TableColumn tCliente;
    @FXML
    private TableColumn tTarifa;
    @FXML
    private TableColumn tCoste;
    @FXML
    private TextField matriculac;
    @FXML
    private TableView tabla1;

    @FXML
    protected void onHelloButtonClick() {


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {




    }


    @FXML
    public void salir(ActionEvent actionEvent) {
        System.exit(0);
    }
}