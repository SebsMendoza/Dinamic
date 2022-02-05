module es.mendoza.dinamic {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.fontawesome5;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires lombok;


    opens es.mendoza.dinamic to javafx.fxml;
    exports es.mendoza.dinamic;
}