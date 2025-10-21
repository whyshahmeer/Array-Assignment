import java.util.Scanner;

public class ArrayIndex {
    private int[] array;
    Scanner sc = new Scanner(System.in);


    public void setLength() {
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        array = new int[length];
    }


    public void setValues() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for Array[" + i + "]: ");
            array[i] = sc.nextInt();
        }
    }


    public void findIndex() {
        System.out.print("Enter a number to find its index: ");
        int num = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println("Element " + num + " found: " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Element not found");
    }
}


