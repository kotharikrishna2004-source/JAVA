#include<iostream>
using namespace std;
int main()
{
    int number=2;
    int guess=21;
    cout << " Guess a number between 1 to 100 "<<endl;
    while(number<100)
    {
        cout<<" Enter a number : ";
        cin>>number;
         if(number==guess)
    {
        cout<< "Congratulation !  You Won This Game : "<<endl;
    }
    else
    {
        cout<< " Another chance TO guess"<<endl;
    }

    }

}
