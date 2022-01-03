package es.mendoza.dinamic;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class DinamicController implements Initializable {
    private TranslateTransition animationMenu, animationButton;
    private Boolean open;

    @FXML
    private AnchorPane backgroundPanel;

    @FXML
    private VBox menuBar;

    @FXML
    private Button menuButton;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        open = false;
    }

    private void move() {
        animationMenu = new TranslateTransition(Duration.millis(500), menuBar);
        animationButton = new TranslateTransition(Duration.millis(500), menuButton);

        if (!open) {
            animationMenu.setToX(75);
            animationButton.setToX(75);
            open = true;
        } else {
            animationMenu.setToX(0);
            animationButton.setToX(0);
            open = false;
        }
        animationMenu.play();
        animationButton.play();
    }

    protected void viewOne() {
        backgroundPanel.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        move();
    }

    protected void viewTwo() {
        backgroundPanel.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
        move();
    }
}
