class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] cal = my_string.split(" ");
        boolean plus = true;
        
        for(String m : cal){
            if(m.equals("+")){
                plus = true;
            }else if(m.equals("-")){
                plus = false;
            }else{
                if(plus){
                    answer += Integer.parseInt(m);
                }else{
                    answer -= Integer.parseInt(m);
                }
            }
        }
        return answer;
    }
}