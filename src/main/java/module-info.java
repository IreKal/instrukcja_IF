module com.example.instrukcja_if {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.instrukcja_if to javafx.fxml;
    exports com.example.instrukcja_if;
}