package it.unical.mat.ingsw.memento;

import java.util.Stack;

// CARETAKER CLASS
public class Caretaker {
    private static Caretaker instance = null;

    private Caretaker() {
        history = new Stack<>();
    }

    public static Caretaker getInstance() {
        if(instance == null)
            instance = new Caretaker();
        return instance;
    }

    Stack<Letter.LetterMemento> history;

    public void saveState(Letter.LetterMemento memento){
        history.push(memento);
    }

    public boolean restoreState(Letter letter) {
        if(history.size() > 0){
            letter.restore(history.pop());
            return true;
        }
        return false;
    }
}
