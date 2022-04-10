//check_array_is _sorted_and_rotated https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

#include<bits/stdc++.h>
using namespace std;
int main(){
    vector<int>nums={2,1,3,4};
     int count=0;
        int n=nums.size();
        for(int i=1;i<nums.size();i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }
        if(nums[n-1]>nums[0]){
            count++;
        }
        bool m=count<=1;
        cout<<m<<endl;
}