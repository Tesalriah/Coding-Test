import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        for(String name : callings){
            int index = map.get(name);
            String front = players[index-1];
            
            players[index] = front;
            players[index-1] = name;
            
            map.put(front, index);
            map.put(name, index-1);
        }
        return players;
    }
}