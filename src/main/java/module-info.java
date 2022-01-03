module es.mendoza.dinamic {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.mendoza.dinamic to javafx.fxml;
    exports es.mendoza.dinamic;
}