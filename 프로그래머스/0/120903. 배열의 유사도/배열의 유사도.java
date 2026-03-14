import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> set = new HashSet<String>(Arrays.asList(s2));
        
        for(String str : s1){
            if(set.contains(str)){
                answer++;
            }
        }
        
        return answer;
    }
}