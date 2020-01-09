package session2;

public class SortArray {

    public static void main(String[] args) {
        Integer i, j;
        Integer numbers[] = { 90, 89, 67, 45, 34, 12, 43, 68, 32, 1 };
        System.out.println("Values Before Sorting");
        for (Integer integer : numbers) {
            System.out.print(integer + " ");
        }
        for (i = 0; i < 10; i++) {
            for (j = i + 1; j < 10; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }
        System.out.println("\n");
        System.out.println("Values After Sorting");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }

    }

}
