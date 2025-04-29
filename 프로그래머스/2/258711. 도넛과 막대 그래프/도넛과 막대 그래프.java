import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        int[] answer = new int[4];
        int max = 0;
        
        for(int i=0; i<edges.length; i++){
            max = Math.max(max, edges[i][0]);
            max = Math.max(max, edges[i][1]);
        }
        
        int[] in = new int[max + 1];
        int[] out = new int[max + 1];
        
        for(int[] edge : edges){
            out[edge[0]]++;
            in[edge[1]]++;
        }
        
        for(int i=1; i<in.length; i++){
            if(in[i] == 0 && out[i] >= 2){
                answer[0] = i;
                break;
            }
        }
        
        for(int i=1; i<in.length; i++){
            if(out[i] == 0 && in[i] != 0){
                answer[2]++;
            }
        }
    
        int outCnt = 0;
        
        for(int[] edge : edges){
            if(answer[0] == edge[0]){
                in[edge[1]]--;
                outCnt++;
            }
        }
        
        for(int i=1; i<in.length; i++){
            if(out[i] == 2 && out[i] == in[i]){
                answer[3]++;
            }
        }
        
        answer[1] = outCnt - (answer[2] + answer[3]);
        
        return answer;
    }
}