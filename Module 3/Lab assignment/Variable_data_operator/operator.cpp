#include<iostream>
using namespace std;
int main()
{
    int a,b,age;
    cout<< " Enter two numbers : ";
    cin>>a>>b;

    //arithmatic operator +,-,*,/,%
    cout<<" sum : "<<a+b<<endl;
    cout<<" sub : "<<a-b<<endl;
    cout<<" mul : "<<a*b<<endl;
    cout<<" div : "<<a/b<<endl;
    cout<<" modules : "<<a%b<<endl;

    //relational operator <,>,<=,>=,==,!=
    cout<< "Enter your age : ";
    cin>>age;
    if(age>10 && age<16)
    {
        cout<<" you can not vote "<<endl;
    }
    else if(age>16 && age<18)
    {
        cout<< "Nearby to vote "<<endl;
    }
    else if(age>=18 && age<50)
    {
        cout<< " you can vote "<<endl;
    }
    else
    {
        cout<< "You are child "<<endl;
    }

    //logical operator &&,||,!
    if(a>b && a<age)
    {
        cout<< "a is big "<<endl;
    }
    else
    {
        cout<< " b is big "<<endl;
    }
    //bitwise operator
    cout << "a & b = " << (a & b) << endl;   // Bitwise AND
    cout << "a | b = " << (a | b) << endl;   // Bitwise OR
    cout << "a ^ b = " << (a ^ b) << endl;   // Bitwise XOR
    cout << "~a = " << (~a) << endl;         // Bitwise NOT (inverts bits)
    cout << "a << 1 = " << (a << 1) << endl; // Left shift (multiply by 2)
    cout << "a >> 1 = " << (a >> 1) << endl; // Right shift (divide by 2)
}
