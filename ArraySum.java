import java.util.Scanner;

public class ArraySum {
    private int[] array;
    int sum = 0;

    Scanner scanner = new Scanner(System.in);

    public void setLength() {
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        array = new int[length];
    }

    public void calculateSum() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        System.out.println("Sum of array elements = " + sum);
    }
}
