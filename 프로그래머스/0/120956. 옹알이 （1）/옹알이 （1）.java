class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] can = {"aya", "ye", "woo", "ma"};
        
        for(int k=0; k<babbling.length; k++){
            String say = babbling[k];
            for(int i=0; i<can.length; i++){
                say = say.replace(can[i], " ");
            }
            if(say.isBlank()){
                answer++;
            }    
        }
        
        return answer;
    }
}