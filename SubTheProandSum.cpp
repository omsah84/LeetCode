#include<iostream>
using namespace std;

class Solution {
public:
    int subtractProductAndSum(int n) {

        int pro = 1;
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            pro = pro*rem;
            sum = sum + rem;

            n = n/10;
        }

        int res = pro - sum;
        return res;
        
    }
};

int main(){
    Solution so;
    int res = so.subtractProductAndSum(234);

    cout << res;

    return 0;
}

