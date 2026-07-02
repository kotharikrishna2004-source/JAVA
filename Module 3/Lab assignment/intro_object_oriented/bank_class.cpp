#include<iostream>
using namespace std;
class Bankaccount
{
    int balance;
public :
     void setfun(int b)
     {
         balance=b;
     }
     int getfun()
     {
         return balance;
     }

    void checkbalance()
    {

        cout<< " Your account balance is : "<<getfun()<<endl;
    }
     void deposit()
     {
         int dep;
         cout<< " privious balance is : "<<getfun()<<endl;
         cout<< "Enter deposit amount : ";
         cin>>dep;
         cout<< " deposit balance is : "<<dep<<endl;
         balance+=dep;
         cout<< " after deposit balance is : "<<balance<<endl;
     }
     void withdraw()
     {
         int wid;
         cout<< " privious balance is : "<<getfun()<<endl;
         cout<< "Enter withdraw amount : ";
         cin>>wid;
        cout<< " withdraw balance is : "<<wid<<endl;
         balance-=wid;
         cout<< " after withdraw balance is : "<<balance<<endl;
     }



};
int main()
{
    Bankaccount b;
    b.setfun(50000);
    b.checkbalance();
    b.deposit();
    b.withdraw();





}
