public class LR4_a_easy {
    public static void main(String[] args) {
        in3050(30, 31);
        in3050(30, 41);
        in3050(40, 50);
    }
    public static boolean in3050(int a, int b) {
        if (((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) || ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)))
            return true;
        else
            return false;
    }

}
