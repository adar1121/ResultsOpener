module com.example.resultsopener {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.resultsopener to javafx.fxml;
    exports com.example.resultsopener;
}