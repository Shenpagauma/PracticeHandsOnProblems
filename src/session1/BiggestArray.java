package session1;

public class BiggestArray {

    public static void main(String[] args) {
        int[] numbers = { 20, 10, 40, 50, 70, 25 };
        System.out.println("Set of Random Numbers ");
        for (int i : numbers) {
            System.out.println(i);
        }
        int temp, j = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Biggest Value ");
        System.out.println(numbers[j - 1]);
    }
}
