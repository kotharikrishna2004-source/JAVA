#include<iostream>
using namespace std;
class Bank
{
private :

    int Balance,deposit,withraw;

public :
    int k;
    char c;
    void setBalance(int B)
    {
        Balance=B;
    }
    int getBalance()
    {
        return Balance;
    }


    void setdeposit()
    {
        deposit;
    }
    int getdeposit()
    {
        return deposit;
    }
     void setwithdraw()
    {
        withraw;
    }
    int getwithraw()
    {
        return withraw;
    }
    void calling()
    {


    do
    {
        cout<< " 1.    Balance_Enquiry "<<endl;
        cout<< " 2.    Balance_Deposit "<<endl;
        cout<< " 3.    Balance_Withdraw "<<endl;
        cout<< " 4.    Exit "<<endl;

        cout<< " Enter a number that related to list : ";
        cin>>k;

        switch(k)
        {
        case 1:
            cout<< " your Curent Balance is : "<<getBalance()<<endl;
            break;
        case 2 :
            cout<< "Enter Deposit amount ";
            cin>>deposit;
             cout<< " Your deposit amount is : "<<deposit<<endl;
             Balance+=deposit;
             cout<< " amount after deposit  : "<<Balance<<endl;
            break;
          case 3 :
              cout<< "Enter WIthdraw amount ";
               cin>>withraw;
             cout<< " Your withdraw amount is : "<<withraw<<endl;
              if(withraw<Balance)
              {
             Balance-=withraw;
             cout<< " amount after withdraw  : "<<Balance<<endl;
            break;
              }
              else
              {
                  cout<< "insufficient to withdraw "<<endl;
              }

          case 4 :
             break;
          default :
              cout<< " Enter valid input "<<endl;

        }
        cout<< " if you want to continue : (y/n) ";
        cin>>c;

    }while(c=='y' || c=='Y');
    }
};
int main()
{
    Bank b;
    b.setBalance(50000);
    b.calling();

}
