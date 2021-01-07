#include <bits/stdc++.h>
#include <math.h>
using namespace std;
/*Task
    Given the meal price (base cost of a meal), tip percent (the percentage of the meal      price being added as tip), and tax percent (the percentage of the meal price 
    being added as tax) for a meal, find and print the meal's total cost. Round the 
    result to the nearest integer.
    */

void solve(double meal_cost, int tip_percent, int tax_percent) {//(base cost of a meal),(the percentage of the meal price being added as tip),(the percentage of the meal price being added as tax)
    double total_cost = 
            meal_cost +
            /*tip_cost = (meal_cost*tip_percent)/100*/ ((meal_cost*tip_percent)/100) +
            /*tax_price = (meal_cost*tax_percent)/100*/((meal_cost*tax_percent)/100);
        cout<<round(total_cost);

}

int main()
{
    double meal_cost;
    cin >> meal_cost;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int tip_percent;
    cin >> tip_percent;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int tax_percent;
    cin >> tax_percent;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    solve(meal_cost, tip_percent, tax_percent);

    return 0;
}
