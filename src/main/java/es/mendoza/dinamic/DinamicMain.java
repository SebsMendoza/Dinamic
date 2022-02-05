package es.mendoza.dinamic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class DinamicMain extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        //Inicia la aplicación en inglés con las palabras del propierties inglés
        Locale locale = new Locale("en", "EN");

        //Este Locale inicia la aplicación con el propierties de español
        //Locale locale = new Locale("es", "ES");
        ResourceBundle bundle = ResourceBundle.getBundle("i18n.strings", locale);
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(getClass().getResource("dinamic.fxml"), bundle);
        Scene scene = new Scene(root, 300, 450);
        stage.setTitle("Interfaz dinámica - Sebastián Mendoza");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}