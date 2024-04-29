
public class Main {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar:");
        for (int i = 2; i <= 100; i++) {
            if (asalMi(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean asalMi(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}