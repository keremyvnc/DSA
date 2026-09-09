class Solution {
public:
    bool isHappy(int n) {
        std::unordered_set<int> s;
        int num = n;
        std::string s_num = std::to_string(n);
        
        while(!s.contains(num)) {
            s.insert(num);
            int sum=0;
            while (num > 0) {
                int digit = num % 10;
                num /= 10;     
                sum += digit*digit;
            }
            if(sum == 1) return true;
            num = sum;
        }
        return false;
    }
};