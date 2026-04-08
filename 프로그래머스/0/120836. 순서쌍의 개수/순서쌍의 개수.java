class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i*i <= n; i++){
            System.out.println(i);
            if(n % i == 0){
                if(i * i == n){
                    answer++;
                }else{
                    answer+=2;
                }
            }
        }
        return answer;
    }
}