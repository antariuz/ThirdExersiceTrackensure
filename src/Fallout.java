public class Fallout {
    public int solve(int[] k) {
        int temp = 0;
        int fallout = 0;
        for (int value : k) {
            temp = Math.max(temp, value);
        }
        for (int i = 1; i <= temp; i++) {
            for (int j = 1; j < k.length - 1; j++) {
                if (k[j] == i) {
                    for (int l = k[j + 1]; l < k.length - 1; l++) {
                        if (l == i) {
                            fallout++;
                            break;
                        }
                    }
                }
            }
        }
        return fallout;
    }
}
