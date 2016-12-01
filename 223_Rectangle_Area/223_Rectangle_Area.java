public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A, E);
        int right = Math.max(left, Math.min(C, G));
        int bottom = Math.max(B,F);
        int top = Math.max(bottom, Math.min(D,H));
        return (A-C)*(B-D) + (E-G)*(F-H) - (right-left)*(top-bottom);
    }
}
