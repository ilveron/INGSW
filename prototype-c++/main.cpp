#include "Professor.h"
#include "Student.h"


int main(int argc, char** argv){
    Professor prof("Stanis", "La Rochelle", 'M', 51, 4750); 
    Student stud("Sofia", "Loren", 'F', 88, 12345);

    prof.addTeaching("Fondamenti di recitazione 1");
    prof.addTeaching("Elementi di espressione visiva");
    prof.addTeaching("Tecniche recitative del cinema straniero");

    stud.addExam("Fondamenti di recitazione 1");
    stud.addExam("Fenomenologia del fascino femminile");
    stud.addExam("Storia del cinema");


    cout << "------- ORIGINAL -------";
    cout << endl << prof << endl;
    cout << endl << stud << endl;
    cout << "------------------------" << endl << endl;

    Person* clonedProf;
    Person* clonedStud;

    clonedProf = prof.clone();
    clonedStud = stud.clone();

    cout << "------ PROTOTYPED ------";
    cout << endl << prof << endl;
    cout << endl << stud << endl;
    cout << "------------------------" << endl;

    return 0;
}
