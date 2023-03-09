module com.jan0.music_player {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.web;


    opens com.jan0.music_player to javafx.fxml;
    exports com.jan0.music_player;
}