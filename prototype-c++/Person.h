#ifndef PERSON_H
#define PERSON_H

#include <iostream>
using namespace std;

class Person {
    protected:
        string name, surname;
        char gender;
        int age;

    public:
        virtual ~Person(){}
        Person(){};

        Person(string name, string surname, char gender, int age) {
            this -> name    =   name;
            this -> surname =   surname;
            this -> gender  =   gender;
            this -> age     =   age;
        }

        Person(const Person& p){
            this -> name    =   p.getName();
            this -> surname =   p.getSurname();
            this -> gender  =   p.getGender();
            this -> age     =   p.getAge();
        }

        //getters
        string getName() const          {return name;}
        string getSurname() const       {return surname;}
        char getGender() const          {return gender;}
        int getAge() const              {return age;}

        //setters
        void setName(string name)       {this -> name = name;}
        void setSurame(string surname)  {this -> surname = surname;}
        void setGender(char gender)     {this -> gender = gender;}
        void setAge(int age)            {this -> age = age;}

        virtual Person *clone() const = 0;
};

#endif