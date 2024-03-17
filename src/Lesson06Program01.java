import java.util.Random;

public class Lesson06Program01 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(99991) + 11;
        System.out.println("Випадкове число: " + randomNumber);

        int sumOfDigits = 0;
        int number = randomNumber;

        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        System.out.println("Сума цифр числа: " + sumOfDigits);
    }
}