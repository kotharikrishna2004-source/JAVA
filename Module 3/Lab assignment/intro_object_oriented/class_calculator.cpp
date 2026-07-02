#include<iostream>
using namespace std;
class cal
{
public:

    int a,b,sum,sub,mul,div;

    void takevalue(int c ,int d)
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
       prin();
    }
    void prin()
    {
       cout<< " sum : "<<sum<<endl;
       cout<< " sub : "<<sub<<endl;
       cout<< " mul : "<<mul<<endl;
       cout<< " div : "<<div<<endl;
    }


};
int main()
{
    cal c;
    c.takevalue(6,8);
    c.calculate();
}
