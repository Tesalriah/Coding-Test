class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] morses = letter.split(" ");
        for(String str : morses){
            for(int i = 0; i < morse.length; i++){
                if(str.equals(morse[i])){
                    answer += (char)(i + 'a') ;
                }
            }
        }
        return answer;
    }
}