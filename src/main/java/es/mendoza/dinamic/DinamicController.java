package es.mendoza.dinamic;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class DinamicController implements Initializable {
    private TranslateTransition animationMenu, animationButton, animationDatos, animationPanelOne, animationPanelTwo;
    private Boolean open;

    @FXML
    private AnchorPane backgroundPanel;

    @FXML
    private VBox menuBar;

    @FXML
    private Button menuButton;

    @FXML
    private Button cargarButton1;

    @FXML
    private AnchorPane opcionOne;

    @FXML
    private AnchorPane opcionTwo;

    @FXML
    void desplazarMenu(ActionEvent event) {
        move();
    }

    @FXML
    void panelOne(ActionEvent event) {
        viewOne();
    }

    @FXML
    void panelTwo(ActionEvent event) {
        viewTwo();
    }

    @FXML
    void panelThree(ActionEvent event) {
        viewThree();
    }

    @FXML
    void salirButton(ActionEvent event) {
        closeWindow();
    }

    @FXML
    void cargarDatosOne(ActionEvent event) {
        opcionOne.setVisible(true);
        opcionOne.setDisable(false);
        cargarButton1.setVisible(false);
        cargarButton1.setDisable(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        open = false;
        opcionOne.setVisible(false);
        opcionOne.setDisable(true);
        opcionTwo.setVisible(false);
        opcionTwo.setDisable(true);
    }

    private void move() {
        animationMenu = new TranslateTransition(Duration.millis(500), menuBar);
        animationButton = new TranslateTransition(Duration.millis(500), menuButton);
        animationDatos = new TranslateTransition(Duration.millis(500), cargarButton1);
        animationPanelOne = new TranslateTransition(Duration.millis(500), opcionOne);
        animationPanelTwo = new TranslateTransition(Duration.millis(500), opcionTwo);

        if (!open) {
            animationMenu.setToX(167);
            animationButton.setToX(130);
            animationDatos.setToX(0);
            animationPanelOne.setToX(167);
            animationPanelTwo.setToX(167);
            open = true;
        } else {
            animationMenu.setToX(0);
            animationButton.setToX(0);
            animationDatos.setToX(0);
            animationPanelOne.setToX(0);
            animationPanelTwo.setToX(0);
            open = false;
        }
        animationMenu.play();
        animationButton.play();
        animationDatos.play();
        animationPanelOne.play();
        animationPanelTwo.play();
    }

    protected void viewOne() {
        move();
        opcionOne.setVisible(false);
        opcionOne.setDisable(true);
        cargarButton1.setVisible(true);
        cargarButton1.setDisable(false);
    }

    protected void viewTwo() {
        move();
        opcionOne.setVisible(false);
        opcionOne.setDisable(true);
        opcionTwo.setVisible(true);
        opcionTwo.setDisable(false);
        cargarButton1.setVisible(false);
        cargarButton1.setDisable(true);
    }

    protected void viewThree() {
        move();
    }

    protected void closeWindow() {
        System.exit(0);
    }
}
