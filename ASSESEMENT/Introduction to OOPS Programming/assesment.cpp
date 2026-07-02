#include <iostream>
#include <ctime>
using namespace std;

class ATM
{
private:
    int pin;
    float balance;

public:
    // Constructor
    ATM();

    void welcomeScreen();
    void menuScreen();
    void checkBalance();
    void deposit();
    void withdraw();
    void help();
};

// Constructor using Scope Resolution Operator
ATM::ATM()
{
    pin = 12345;
    balance = 60000;
}

// Welcome Screen
void ATM::welcomeScreen()
{
    time_t now = time(0);

    cout << "=====================================\n";
    cout << "        WELCOME TO ATM SYSTEM        \n";
    cout << "=====================================\n";

    cout << "Current Date & Time : " << ctime(&now);

    cout << "\n1. Login";
    cout << "\n2. Help";
    cout << "\n3. Exit\n";
}

// Help Screen
void ATM::help()
{
    cout << "\n===== HELP SCREEN =====\n";
    cout << "1. Enter ATM PIN to Login\n";
    cout << "2. PIN is 12345\n";
    cout << "3. You can Deposit, Withdraw and Check Balance\n";
}

// Menu Screen
void ATM::menuScreen()
{
    int choice;

    do
    {
        cout << "\n====== ATM MENU ======\n";
        cout << "1. Check Balance\n";
        cout << "2. Deposit Amount\n";
        cout << "3. Withdraw Amount\n";
        cout << "4. Exit\n";

        cout << "Enter your choice: ";
        cin >> choice;

        switch(choice)
        {
            case 1:
                checkBalance();
                break;

            case 2:
                deposit();
                break;

            case 3:
                withdraw();
                break;

            case 4:
                cout << "\nThank You for Using ATM\n";
                break;

            default:
                cout << "\nInvalid Choice!\n";
        }

    } while(choice != 4);
}

// Check Balance
void ATM::checkBalance()
{
    cout << "\nCurrent Balance = Rs. " << balance << endl;
}

// Deposit Money
void ATM::deposit()
{
    float amount;

    cout << "\nEnter Amount to Deposit: ";
    cin >> amount;

    balance = balance + amount;

    cout << "Amount Deposited Successfully!\n";
    cout << "Updated Balance = Rs. " << balance << endl;
}

// Withdraw Money
void ATM::withdraw()
{
    float amount;

    cout << "\nEnter Amount to Withdraw: ";
    cin >> amount;

    if(amount > balance)
    {
        cout << "Insufficient Balance!\n";
    }
    else
    {
        balance = balance - amount;

        cout << "Withdrawal Successful!\n";
        cout << "Remaining Balance = Rs. " << balance << endl;
    }
}

// Main Function
int main()
{
    ATM obj;

    int mainChoice;
    int userPin;

    obj.welcomeScreen();

    cout << "\nEnter Choice: ";
    cin >> mainChoice;

    switch(mainChoice)
    {
        case 1:

            cout << "\nEnter ATM PIN: ";
            cin >> userPin;

            if(userPin == 12345)
            {
                cout << "\nLogin Successful!\n";
                obj.menuScreen();
            }
            else
            {
                cout << "\nIncorrect PIN! Exiting...\n";
            }

            break;

        case 2:
            obj.help();
            break;

        case 3:
            cout << "\nThank You!\n";
            break;

        default:
            cout << "\nInvalid Choice!\n";
    }

    return 0;
}