package fallout;

public class Fallout {

    public int solve(int[] k) {
        int result = 0;
        int left;
        int right;
        for (int i = 1; i < k.length - 1; i++) {
            left = k[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, k[j]);
            }
            right = k[i];
            for (int l = i + 1; l < k.length; l++) {
                right = Math.max(right, k[l]);
            }
            result += Math.min(left, right) - k[i];
        }
        return result;
    }

}
