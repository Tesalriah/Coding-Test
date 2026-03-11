import java.util.*;

class Solution {
    public int solution(int[] array) {
        int arr[] = new int[1000];
        int answer = 0;
        
        for(int num : array){
            arr[num]++;
        }
        
        int arr2[] = new int[999];
        arr2 = arr.clone();
        Arrays.sort(arr2);
        answer = arr2[999];
        
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == arr2[999]){
                cnt++;
                answer = i;
            }
        }
        return cnt > 1 ? -1 : answer;
    }
}