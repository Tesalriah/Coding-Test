class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int index = -2;
        while(k != 0){
            index += 2;
            if(index >= numbers.length){
                index = index - numbers.length;
            }
            k--;
        }
        answer = numbers[index];
        return answer;
    }
}