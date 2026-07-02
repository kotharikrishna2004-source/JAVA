#include<iostream>
using namespace std;
class calculator
{
public :

    int a,b,sum,sub,mul,div;

    void takevalue(int c,int d)
    {
       a=c;
       b=d;
    }
    void calculate()
    {
        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        pri();
    }
    void pri()
    {
        cout<< " Sum is : "<<sum<<endl;
         cout<< " Sub is : "<<sub<<endl;
          cout<< " mul is : "<<mul<<endl;
           cout<< " div is : "<<div<<endl;
    }
};
int main()
{
    calculator c;
    c.takevalue(5,6);
    c.calculate();
}
