import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();
        for(String friend : friends){
            map.put(friend, 0);
            result.put(friend, 0);
        }
        for(String gift : gifts){
            if(map.get(gift) == null){
                map.put(gift, 1);
            }else{
                map.put(gift, map.get(gift) + 1);
            }
            map.put(gift.split(" ")[0] ,map.get(gift.split(" ")[0]) + 1);
            map.put(gift.split(" ")[1] ,map.get(gift.split(" ")[1]) - 1);
        }
        
        for(int i=0; i<friends.length; i++){
            for(int j=0; j<friends.length; j++){
                if(i != j){
                    String[] compStr = {friends[i] + " " + friends[j], friends[j] + " " + friends[i]};
                    Integer comp1 = map.get(compStr[0]);
                    Integer comp2 = map.get(compStr[1]);
                    
                    if(comp1 != null){
                        if( comp2 == null || comp1 > comp2){
                            result.put(friends[i], result.get(friends[i])+1);
                            if(friends[i] == "ryan"){
                            }
                        }else if(comp1 == comp2){
                            if(map.get(friends[i]) > map.get(friends[j])){
                                result.put(friends[i], result.get(friends[i])+1);
                            }
                        }
                    }else if(comp2 == null){
                        if(map.get(friends[i]) > map.get(friends[j])){
                            result.put(friends[i], result.get(friends[i])+1);
                        }
                    }
                }
            }
        }
        for(Map.Entry<String,Integer> entry : result.entrySet()){
            if(entry.getValue() > answer){
                answer = entry.getValue();
            } 
        }
                                            
        return answer;
    }
}