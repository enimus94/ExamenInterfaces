package com.example.exameninterfaces3;

import clases.Coche;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

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
    private TableView<Coche> tabla1;
    @FXML
    private Label alert;
    @FXML
    private RadioButton bar;
    @FXML
    private VBox cTarifa;
    @FXML
    private Label cCoste;

    @FXML
    protected void onHelloButtonClick() {


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        cModelo.getItems().add("Mondeo");
        cModelo.getItems().add("Picanto");
        cModelo.getItems().add("focus");
        cModelo.getSelectionModel().selectFirst();

        cCliente.getItems().add("Cayetano");
        cCliente.getItems().add("Santiago");
        cCliente.getItems().add("Jaime");
        cModelo.getSelectionModel().selectFirst();

        String matricula = matriculac.getText();
        String modelo = (String) cModelo.getSelectionModel().getSelectedItem();
       // String fechaEntrada = tFechaEntrada.getText();
       // String fechaSalida = cFechaSalida.getText();
        String cliente = (String) cCliente.getSelectionModel().getSelectedItem();
       // String tarifa = cTarifa.getText();
        String coste = cCoste.getText();

        Coche nuevoRegistro = new Coche();
        tabla1.getItems().add(nuevoRegistro);


    }


    @FXML
    public void salir(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void datos(Event event) {
        var alert= new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("2DAM");
        alert.setContentText("Creado por cayetano");
        alert.showAndWait();


    }

    @FXML
    public void añadir(ActionEvent actionEvent) {

        Coche coche = new Coche();
        coche.setMatricula(matriculac.getText());
        coche.setModelo((String) cModelo.getSelectionModel().getSelectedItem());
        coche.setCliente((String) cCliente.getSelectionModel().getSelectedItem());
        coche.setTarifa(bar.getTypeSelector());
        tabla1.getItems().add(coche);

    }
}