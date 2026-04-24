class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        int index = 0;
        int index2 = 0;
        
        for(int i = 0; i < num_list.length; i++){
            answer[index][index2] = num_list[i];
            index2++;
            if((i + 1) % n == 0){
                index++;
                index2 = 0;
            }
        }
        
        return answer;
    }
}