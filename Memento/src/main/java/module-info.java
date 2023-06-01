module it.unical.mat.ingsw.memento {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.unical.mat.ingsw.memento to javafx.fxml;
    exports it.unical.mat.ingsw.memento;
}