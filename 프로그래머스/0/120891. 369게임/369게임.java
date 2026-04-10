class Solution {
    public int solution(int order) {
        String num = order + "";
        num = num.replaceAll("[1245780]+", "");
        return num.length();
    }
}