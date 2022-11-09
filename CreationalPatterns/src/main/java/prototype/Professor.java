package prototype;

import java.util.ArrayList;

public class Professor extends Person {
    private Integer wage;
    private ArrayList<String> teachings;

    public Professor(){
        this.teachings = new ArrayList<>();
    }

    public Professor(Professor p){
        super(p);
        this.wage = p.getWage();
        this.teachings = new ArrayList<>();

        for(String t : p.getTeachings())
            this.teachings.add(t);
    }

    @Override
    public Person clone() {
        return new Professor(this);
    }

    public String toString() {
        return "--- Professor ---" + System.lineSeparator() +
                "Full name: " + getName() + " " + getSurname() + ";" + System.lineSeparator() +
                "Wage: " + wage + ";" + System.lineSeparator() +
                "Teachings: " + teachings;
    }

    public Integer getWage() {
        return wage;
    }

    public void setWage(Integer wage) {
        this.wage = wage;
    }

    public ArrayList<String> getTeachings() {
        return teachings;
    }

    public void setTeachings(ArrayList<String> teachings) {
        this.teachings = teachings;
    }

    public void addTeaching(String teaching){
        this.teachings.add(teaching);
    }
}
