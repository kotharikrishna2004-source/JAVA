#include<iostream>
using namespace std;
int main()
{
    int arr[5],sum=0,avg;
    cout<< " Enter five numbers to display sum and average : ";
    for(int i=0;i<5;i++)
    {
        cin>>arr[i];
        sum=sum+arr[i];

    }
    avg=sum/5;
    cout<<  " sum is : "<<sum<<endl;
    cout<<  " avg is : "<<avg<<endl;

}
