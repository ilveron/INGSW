package prototype.client;

import prototype.prototype.Person;
import prototype.prototype.Professor;
import prototype.prototype.Student;

public class PrototypeDemo {
    public static void run(){
        Student s = new Student();
        Professor p = new Professor();

        setupStudent(s);
        setupProfessor(p);

        System.out.println("------- ORIGINAL --------");
        System.out.println(s);
        System.out.println();
        System.out.println(p);
        System.out.println("-------------------------");

        Person cloneS = s.clone();
        Person cloneP = p.clone();

        System.out.println();
        System.out.println("------- PROTOTYPED --------");
        System.out.println(cloneS);
        System.out.println();
        System.out.println(cloneP);
        System.out.println("---------------------------");
    }

    public static void setupStudent(Student s){
        s.setName("Paolo");
        s.setSurname("Sorrentino");
        s.setNumber("00123");
        s.setAge((byte)52);
        s.setGender('M');
        s.addExam("Fondamenti di regia 1");
        s.addExam("Storia del cinema");
        s.addExam("Elementi di sceneggiatura");
    }

    public static void setupProfessor(Professor p){
        p.setName("Renato");
        p.setSurname("Ferretti");
        p.setAge((byte)63);
        p.setGender('M');
        p.setWage(4000);
        p.addTeaching("Tecniche avanzate di regia");
        p.addTeaching("Ottica applicata alla cardiologia");
        p.addTeaching("Fenomenologia della fiction italiana");
    }
}
