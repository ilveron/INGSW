#ifndef STUDENT_H
#define STUDENT_H

#include "Person.h"
#include <vector>

class Student : public Person {
    protected:
        string number;
        vector<string> takenExams;

    public:
        friend ostream& operator <<(ostream& out, const Student& p);
        Student(){};

        Student(string name, string surname, char gender, int age, int number) : Person(name, surname, gender, age) {
            this -> number = number;
        }

        Student(const Student& s) : Person(s.getName(), s.getSurname(), s.getGender(), s.getAge()){
            this -> number = s.getNumber();
        }

        //getters
        string getNumber() const                   {return number;}
        vector<string> getTakenExams() const   {return takenExams;}

        //setters
        void setName(string name)               {this -> name = name;}
        void setSurame(string surname)          {this -> surname = surname;}
        void setGender(char gender)             {this -> gender = gender;}
        void setAge(int age)                    {this -> age = age;}
        void setNumber(string number)           {this -> number = number;}
        
        void addExam(string exam);

        Person *clone() const override {return new Student(*this);} 

        
};

ostream& operator<<(ostream& out, const Student& s) {
    string takenStr = "{ ";
    
    for(string e : s.getTakenExams())
        takenStr += e + ", ";

    takenStr.pop_back();
    takenStr.pop_back();
    takenStr += " }";

    out << "--- Student ---" << endl 
    << "Full name: " << s.getName() << " " << s.getSurname() << ";" << endl
    << "Age: " << s.getAge() << ";" << endl
    << "Gender: " << s.getGender() << ";" << endl
    << "Student number: " << s.getNumber() << ";" << endl
    << "Taken Exams: " << takenStr << ".";
    return out;
}

void Student::addExam(string exam) {this -> takenExams.push_back(exam);}

#endif