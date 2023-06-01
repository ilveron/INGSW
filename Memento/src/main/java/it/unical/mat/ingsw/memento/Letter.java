package it.unical.mat.ingsw.memento;

// ORIGINATOR CLASS
public class Letter {
    private String text = "";

    public LetterMemento save(String text){
        this.text = text;
        return new LetterMemento(text);
    }

    public String getText(){return this.text;}

    public void restore(LetterMemento memento){
        this.text = memento.getText();
    }

    // NESTED MEMENTO CLASS
    public class LetterMemento {
        private String text;

        private LetterMemento(String text){
            this.text = text;
        }

        private String getText(){
            return text;
        }
    }
}
