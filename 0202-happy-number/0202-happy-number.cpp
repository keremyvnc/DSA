class Solution {
public:
    bool isHappy(int n) {
        std::set<std::string> s;
        std::string s_num = std::to_string(n);
        
        while(!s.contains(s_num)) {
            s.insert(s_num);
            int sum=0;
            for(char c : s_num){
                int digit = c - '0';
                sum += std::pow(digit, 2);
            }
            if(sum == 1) return true;
            s_num = std::to_string(sum);
        }
        return false;
    }
};