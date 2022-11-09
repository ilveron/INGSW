package prototype;

import java.util.ArrayList;

public class Student extends Person {
    private String number;
    private ArrayList<String> takenExams;

    public Student () {
        this.takenExams = new ArrayList<>();
    }
    public Student(Student s){
        super(s);
        this.number = s.getNumber();
        this.takenExams = new ArrayList<>();

        for(String exam:s.getTakenExams())
            this.takenExams.add(exam);
    }

    @Override
    public Person clone() {
        return new Student(this);
    }

    public String toString() {
        return "--- Student ---" + System.lineSeparator() +
                "Full name: " + getName() + " " + getSurname() + ";" + System.lineSeparator() +
                "Student number: " + number + ";" + System.lineSeparator() +
                "Taken exams: " + takenExams;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<String> getTakenExams() {
        return takenExams;
    }

    public void addExam(String exam){
        this.takenExams.add(exam);
    }

    public void setTakenExams(ArrayList<String> takenExams) {
        this.takenExams = takenExams;
    }
}
