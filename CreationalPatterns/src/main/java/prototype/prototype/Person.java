package prototype.prototype;

public abstract class Person {
    private String name, surname;
    private Character gender;
    private Byte age;

    public Person(){ }
    public Person(Person p){
        this.name = p.getName();
        this.surname = p.getSurname();
        this.gender = p.getGender();
        this.age = p.getAge();
    }

    public abstract Person clone();

    //GETTERS and SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
}
