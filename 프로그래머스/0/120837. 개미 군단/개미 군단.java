class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] ant = {5,3,1};
        for(int i : ant){
            answer += hp / i;
            hp = hp % i;
        }
        return answer;
    }
}