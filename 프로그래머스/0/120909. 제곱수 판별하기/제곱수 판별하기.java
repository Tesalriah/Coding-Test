class Solution {
    public int solution(int n) {
        return Math.sqrt(n) % 1 != 0 ? 2 : 1;
    }
}