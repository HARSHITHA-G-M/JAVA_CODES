public class Armstrong {
    public static void main(String[] args) {
        int n = 153, sum = 0, temp = n;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        System.out.println(temp + (temp == sum ? " is " : " is not ") + "an Armstrong number");
    }
}

