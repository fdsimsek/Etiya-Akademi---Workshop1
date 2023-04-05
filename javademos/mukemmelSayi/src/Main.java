public class Main {
    public static void main(String[] args) {
        int number = -1;
        int sum = 0;

        if (number<1){
            System.out.println("Sayı geçersizdir");
            return;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == number) {
            System.out.println(number + " mükemmel sayıdır");
        } else {
            System.out.println(number + " mükemmel sayı değildir");
        }
    }
}