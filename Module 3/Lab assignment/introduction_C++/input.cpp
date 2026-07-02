#include<iostream>
using namespace std;
int main()
{

   string name[3];
   int age[3];
   for(int i=0;i< 3;i++)
   {
       cout<< " ENter name : ";
       cin>>name[i];
       cout<< " ENter age : ";
       cin>>age[i];

   }
   for(int i=0;i< 3;i++)
   {
       cout<< "  Hello "<<name[i]<<endl;
       cout<< " age "<<age[i]<<endl;


   }

}



