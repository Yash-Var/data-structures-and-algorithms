#include <bits/stdc++.h>
using namespace std;
void sum(int arr[][4])
{
    int value = INT32_MIN;
    int index;
    for (int i = 0; i < 3; i++)
    {
        int sum = 0;
        for (int j = 0; j < 4; j++)
        {
            sum = sum + arr[i][j];
        }
        if (value < sum)
        {
            value = sum;
            index = i;
        }
        sum = 0;
    }
    cout << value << " " << index + 1 << " " << endl;
}
int main()
{
    int a[3][4] = {{1 ,2 ,3, 4},
                   {5, 6, 7, 8},

                   {9 ,10, 11, 12}};
    for (int j = 0; j < 4; j++)
    {
        if (j % 2 == 0)
        {
            for (int i = 0; i < 3; i++)
            {
                cout << a[i][j] << " ";
            }
        }
        else
        {

            for (int i = 2; i >= 0; i--)
            {
                cout << a[i][j] << " ";
            }
        }
    }
    cout << "Row Wise sum is:-" << endl;
    sum(a);
}