#include<iostream>
using namespace std;
int fun(int n)
{
    //base condition
    if(n==1 || n==0)
    {
        return 1;
    }
    else
    {
        //recursive calling
        return n*fun(n-1);
    }
}
int main()
{
    cout<<fun(5);
}
