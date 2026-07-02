#include<iostream>
using namespace std;
int main()
{
        int n,range;
        cout<< " Enter a number you want to print a table : ";
        cin>>n;
        cout<< " Enter a number of range : ";
        cin>>range;

        for(int i=n;i<=n*range;i=i+n)
        {
            cout<<i<<endl;
        }

}
