class Solution {
    int b,s,count;
    
    public int solution(int balls, int share) {
        b = balls;
        s = share;
        int[] result = new int[s];
        comb(0,0);
        return count;
    }
    
    void comb(int start, int depth){
        if(depth == s){
            count++;
            return;
        }
        
        for(int i = start; i < b; i++){
            comb(i+1, depth+1);
        }
    }
}