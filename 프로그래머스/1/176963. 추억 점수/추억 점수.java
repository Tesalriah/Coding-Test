import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            int result = 0;
            for(int j=0; j<photo[i].length; j++){
                String photoName = photo[i][j];
                Integer score = map.get(photoName);
                if(score != null){
                    result += score;
                }
            }
            answer[i] = result;
        }
        return answer;
    }
}