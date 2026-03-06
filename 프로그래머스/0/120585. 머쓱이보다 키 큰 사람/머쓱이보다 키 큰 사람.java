class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int stat : array){
            if(stat > height){
                answer++;
            }
        }
        return answer;
    }
}