class Solution {
    public String solution(String s) {
        String answer = "";
        int[] alp = new int[26];
        for(char c : s.toCharArray()){
            alp[c - 'a']++;
        }
        
        for(int i = 0; i < alp.length; i++){
            if(alp[i] == 1){
                answer += (char) (i + 'a');
            }
        }
        return answer;
    }
}