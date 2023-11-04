module com.example.media_player {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.media_player to javafx.fxml;
    exports com.example.media_player;
}