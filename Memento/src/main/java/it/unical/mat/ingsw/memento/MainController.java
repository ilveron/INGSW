package it.unical.mat.ingsw.memento;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    Letter letter;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        letter = new Letter();
    }
    @FXML
    private Button btnSave;

    @FXML
    private Button btnSend;

    @FXML
    private Button btnUndo;

    @FXML
    private TextArea txtLetter;

    @FXML
    void save(ActionEvent event) {
        save();
    }

    @FXML
    void send(ActionEvent event) {
        send();
    }

    @FXML
    void undo(ActionEvent event) {
        undo();
    }

    private void undo(){
        boolean done = Caretaker.getInstance().restoreState(letter);
        if (done)
            txtLetter.setText(letter.getText());
    }

    private void save(){
        Caretaker.getInstance().saveState(letter.save(txtLetter.getText()));
    }

    private void send(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure? This operation is irreversible");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            Caretaker.getInstance().saveState(letter.save(txtLetter.getText()));
            System.out.println("Here's the letter which Santa will read asap: " + System.lineSeparator() + letter.getText());
            Platform.exit();
            System.exit(0);
        }
    }
}