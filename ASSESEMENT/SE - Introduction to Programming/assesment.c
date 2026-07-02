#include <stdio.h>

int main()
{
    int choice, qty;
    char more;
    float total = 0;

    do
    {
        // Display Menu
        printf("\n====== FOOD MENU ======\n");
        printf("1. Pizza      - Rs 200\n");
        printf("2. Burger     - Rs 120\n");
        printf("3. Sandwich   - Rs 100\n");
        printf("4. Cold Drink - Rs 50\n");

        // Take user choice
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        // Quantity
        printf("Enter quantity: ");
        scanf("%d", &qty);

        // Bill Calculation using switch
        switch(choice)
        {
            case 1:
                total = total + (200 * qty);
                break;

            case 2:
                total = total + (120 * qty);
                break;

            case 3:
                total = total + (100 * qty);
                break;

            case 4:
                total = total + (50 * qty);
                break;

            default:
                printf("Invalid Choice!\n");
        }

        // Ask for more order
        printf("\nDo you want to order more? (y/n): ");
        scanf(" %c", &more);

    } while(more == 'y' || more == 'Y');

    // Final Bill
    printf("\n====== FINAL BILL ======\n");
    printf("Total Amount = Rs %.2f\n", total);

    return 0;
}