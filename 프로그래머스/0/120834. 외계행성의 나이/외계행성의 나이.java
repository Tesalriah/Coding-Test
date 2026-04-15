class Solution {
    public String solution(int age) {
        String ageStr = age + "";
        String answer = "";
        for(char c : ageStr.toCharArray()){
            answer += (char)(c + 49);
        }
        
        return answer;
    }
}