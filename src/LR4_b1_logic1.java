public class LR4_b1_logic1 {

    public static void main(String[] args) {
        greenTicket(1, 2, 3);
        greenTicket(2, 2, 2);
        greenTicket(1, 1, 2);


    }

    public static int greenTicket(int a, int b, int c) {
        int result = 0;
        if (a!=b && b!=c && a!=c) result = 0;
        else if (a==b && b==c) result = 20;
        else if ((a==b && a!=c) || (b==c && b!=a) || (a==c && c!=b)) result = 10;
        return result;
    }
}
