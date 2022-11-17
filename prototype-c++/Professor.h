#ifndef PROFESSOR_H
#define PROFESSOR_H

#include "Person.h"
#include <vector>

class Professor : public Person {
    protected:
        int wage;
        vector<string> teachings;

    public:
        friend ostream& operator <<(ostream& out, const Professor& p);
        Professor(){};

        Professor(string name, string surname, char gender, int age, int wage) : Person(name, surname, gender, age) {
            this -> wage = wage;
        }

        Professor(const Professor& p) : Person(p.getName(), p.getSurname(), p.getGender(), p.getAge()){
            this -> wage = p.getWage();
        }

        //getters
        int getWage() const                 {return wage;}
        vector<string> getTeachings() const    {return teachings;}

        //setters
        void setName(string name)           {this -> name = name;}
        void setSurame(string surname)      {this -> surname = surname;}
        void setGender(char gender)         {this -> gender = gender;}
        void setAge(int age)                {this -> age = age;}
        
        void addTeaching(string teaching);

        Person *clone() const override {return new Professor(*this);} 

        
};

ostream& operator<<(ostream& out, const Professor& p) {
    string teachingsStr = "{ ";
    
    for(string t : p.getTeachings())
        teachingsStr += t + ", ";

    teachingsStr.pop_back();
    teachingsStr.pop_back();
    teachingsStr += " }";

    out << "--- Professor ---" << endl 
    << "Full name: " << p.getName() << " " << p.getSurname() << ";" << endl
    << "Age: " << p.getAge() << ";" << endl
    << "Gender: " << p.getGender() << ";" << endl
    << "Wage: " << p.getWage() << ";" << endl
    << "Teachings: " << teachingsStr << ".";
    return out;
}

void Professor::addTeaching(string teaching) {this -> teachings.push_back(teaching);}

#endif