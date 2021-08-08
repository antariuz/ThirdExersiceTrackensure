public class ThirdExercise {

    public static void main(String[] args) {
        Fallout fallout = new Fallout();
        int[] k = {0, 1, 0, 3, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = fallout.solve(k);
        System.out.println(result);
    }

}
