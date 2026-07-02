#include<iostream>
using namespace std;
class person
{
public :
    int id;
    string name;
    void access(int d,string n)
    {
        id=d;
        name=n;

    }
    void pri()
    {
        cout<< " person id : "<<id<<endl;
        cout<< " person name : "<<name<<endl;
    }
};
class Student : public person
{
public :
    void stu()
    {
        cout<< "Enter student id : ";
        cin>>id;
        cout<< "Enter student name : ";
        cin>>name;
        cout<< "student id : "<<id<<endl;
        cout<< " student name : "<<name<<endl;
    }
};
class Teacher : public person
{
public :
      void teacher()
    {
        cout<< "Enter Teacher id : ";
        cin>>id;
        cout<< "Enter Teacher name : ";
        cin>>name;
        cout<< "Teacher id : "<<id<<endl;
        cout<< " Teacher name : "<<name<<endl;
    }
};
int main()
{
Student p;
p.stu();


}





