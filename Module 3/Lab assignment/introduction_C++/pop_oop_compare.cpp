#include<iostream>
using namespace std;
class ractangle{
public :
    int l,b;
    void calculate(int j,int k){
        l=j;
        b=k;
    }
    void pri(){
        cout<< " area is : "<<l*b<<endl;
    }
};
int main()
{
    //by object
    ractangle r;
    r.calculate(5,6);
    r.pri();

}
