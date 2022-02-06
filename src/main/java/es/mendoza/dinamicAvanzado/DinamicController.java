package es.mendoza.dinamicAvanzado;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class DinamicController implements Initializable {
    private TranslateTransition animationMenu, animationButton, animationDatos, animationPanelOne, animationPanelTwo;
    private Boolean open;

    @FXML
    private VBox menuBar;

    @FXML
    private Button menuButton;

    @FXML
    private Button spanish;

    @FXML
    private Button english;

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
    void toSpanish(ActionEvent event) {
        //Aquí se supone que se cambiaba el Locale a español al pulsar el botón
    }

    @FXML
    void toEnglish(ActionEvent event) {
        //Aquí se supone que se cambia el Locale a inglés al pulsar el botón
    }

    @FXML
    void settings(ActionEvent event) {
        viewThree();
    }

    @FXML
    void salirButton(ActionEvent event) {
        closeWindow();
    }

    @FXML
    void cargarDatosOne(ActionEvent event) {
        //Botón que al pulsar muestra una vista distinta a la principal, ocultando el botón y la vista principal
        opcionOne.setVisible(true);
        opcionOne.setDisable(false);
        cargarButton1.setVisible(false);
        cargarButton1.setDisable(true);

    }

    /**
     * Método que inicializa la aplicación con las configuraciones que queramos
     * En nuestro caso, hacemos que se muestre el panel principal con el botón que carga los datos
     *
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Inicializamos varios paneles a invisibles para que no se superponga uno sobre otro
        open = false;
        opcionOne.setVisible(false);
        opcionOne.setDisable(true);
        opcionTwo.setVisible(false);
        opcionTwo.setDisable(true);
        spanish.setVisible(false);
        spanish.setDisable(true);
        english.setVisible(false);
        english.setDisable(true);
    }

    /**
     * Método que mueve los botones desde su punto de origen hacia la derecha con animación incluida
     */
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

    /**
     * Método que hace mostrar el Layaout principal y ocultar los demás
     */
    protected void viewOne() {
        move();
        opcionOne.setVisible(false);
        opcionOne.setDisable(true);
        opcionTwo.setVisible(false);
        opcionTwo.setDisable(true);
        cargarButton1.setVisible(true);
        cargarButton1.setDisable(false);
        spanish.setVisible(false);
        spanish.setDisable(true);
        english.setVisible(false);
        english.setDisable(true);
    }

    /**
     * Método que hace aparecer el segundo Layout y ocultar los demás
     */
    protected void viewTwo() {
        move();
        opcionOne.setVisible(false);
        opcionOne.setDisable(true);
        opcionTwo.setVisible(true);
        opcionTwo.setDisable(false);
        cargarButton1.setVisible(false);
        cargarButton1.setDisable(true);
        spanish.setVisible(false);
        spanish.setDisable(true);
        english.setVisible(false);
        english.setDisable(true);
    }

    /**
     * Método que abre un nuevo Layout de ajustes, haciendo que se oculten los demás
     */
    protected void viewThree() {
        move();
        opcionOne.setVisible(false);
        opcionOne.setDisable(true);
        opcionTwo.setVisible(false);
        opcionTwo.setDisable(true);
        cargarButton1.setVisible(false);
        cargarButton1.setDisable(true);
        spanish.setVisible(true);
        spanish.setDisable(false);
        english.setVisible(true);
        english.setDisable(false);
    }

    /**
     * Método que cierra la aplicación
     */
    protected void closeWindow() {
        System.exit(0);
    }
}
