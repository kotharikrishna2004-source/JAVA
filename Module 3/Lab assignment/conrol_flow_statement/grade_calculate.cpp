#include<iostream>
using namespace std;
int main()
{
    int percent,phy,che,maths,total;

    cout<< " Enter a marks of physics : ";
    cin>>phy;
    cout<< " Enter a marks of chemistry : ";
    cin>>che;
    cout<< " Enter a marks of maths : ";
    cin>>maths;

    total=phy+che+maths;
    cout<< " total  obtain marks is : "<<total<<endl;

    percent=total*100/300;

    if(percent>90 && percent<=100)
    {
        cout<< " A+ Grade "<<endl;
    }
    else if(percent>80 && percent<=90)
    {
        cout<< " A Grade "<<endl;
    }
     else if(percent>70 && percent<=80)
    {
        cout<< " B+ Grade "<<endl;
    }
     else if(percent>60 && percent<=70)
    {
        cout<< " B Grade "<<endl;
    }
     else if(percent>50 && percent<=60)
    {
        cout<< " C+ Grade "<<endl;
    }
     else if(percent>40 && percent<=50)
    {
        cout<< " C Grade "<<endl;
    }
     else if(percent>35 && percent<=40)
    {
        cout<< " D Grade "<<endl;
    }
     else
    {
        cout<< " Fail In This Exam "<<endl;
    }








}
