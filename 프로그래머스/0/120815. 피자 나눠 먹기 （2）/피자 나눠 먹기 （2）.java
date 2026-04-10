class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        while(true){
            answer += 6;
            cnt++;
            if(answer % n == 0){
                break;
            }
        }
        return cnt;
    }
}