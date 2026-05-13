class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] minArr = new int[array.length];
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > n){
                minArr[i] = array[i] - n;
            }else{
                minArr[i] = n - array[i];
            }
        }
        
        int index = 0;
        int min = 100;
        
        for(int i = 0; i < minArr.length; i++){
            if(minArr[i] < min){
                min = minArr[i];
                index = i;
            }else if (min == minArr[i]){
                if(array[i] < array[index]){
                    min = minArr[i];
                    index = i;
                }
            }
        }
        return array[index];
    }
}