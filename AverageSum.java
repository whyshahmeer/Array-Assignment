import java.util.Scanner;

public class AverageSum {
    private int[] array;
    int sum = 0;
    double average = 0;

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

        average = (double) sum / array.length;

        System.out.println("Sum of elements = " + sum);
        System.out.println("Average of array = " + average);
    }
}
