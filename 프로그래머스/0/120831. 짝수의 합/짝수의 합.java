class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 != 0){
            n = n - 1;
        }
        for(int i = n; i >= 0; i-=2){
            answer += i;
        }
        
        return answer;
    }
}