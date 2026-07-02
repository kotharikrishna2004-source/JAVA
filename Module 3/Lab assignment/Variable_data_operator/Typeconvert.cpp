#include<iostream>
using namespace std;
int main()
{
    float a;
    int b;

    cout<< "Enter a float number  : ";
    cin>>a;
    cout<< "Enter a int number  : ";
    cin>>b;

    //implicit hoga means default float varible lega
    cout<< "sum is : "<<a+b<<endl;
    //explicit means hum uska type manual change krenge
    cout<< "sum is : "<<(int)a+b<<endl;


}
