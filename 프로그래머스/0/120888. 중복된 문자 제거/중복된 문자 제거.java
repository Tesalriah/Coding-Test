class Solution {
    public String solution(String my_string) {
        String answer = "";
        boolean[] ascii = new boolean[128];
        
        for(char c : my_string.toCharArray()){
            if(ascii[c] == false){
                ascii[c] = true;
                answer += c;
            }
        }
        return answer;
    }
}