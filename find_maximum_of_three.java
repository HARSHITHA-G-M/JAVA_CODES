public class MaxOfThree {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 17;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Maximum: " + max);
    }
}

