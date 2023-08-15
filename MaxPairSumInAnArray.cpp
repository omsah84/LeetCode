class Solution {
public:

    int getMax(int num){
        int ans = 0;

        while(num>0){
            int temp = num%10;
            num = num/10;
            ans = max(ans,temp);
        }
        return ans;
    }

    int maxSum(vector<int>& nums) {
        int ans = -1;
        for(int i = 0;i<nums.size();i++){
            int number = nums.at(i);
            int maxNum = getMax(number);
            
            for(int j = i+1;j<nums.size();j++){
                int numbers = nums.at(j);
                int secondmax = getMax(numbers);

                if(secondmax == maxNum){
                    int sum = nums.at(i) + nums.at(j);

                    ans = max(ans,sum);
                }
            }
        }

        return ans;
    }
};