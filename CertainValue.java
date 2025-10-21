import java.util.Scanner;

public class CertainValue {
    private int[] array;
    Scanner sc = new Scanner(System.in);


    public void setLength() {
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        array = new int[length];
    }


    public void valueInArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for Array[" + i + "]: ");
            array[i] = sc.nextInt();
        }

        System.out.println("Elements in Array:");
        for (int value : array) {
            System.out.println(value);
        }
    }


    public void searchValue() {
        System.out.print("Enter a number to search: ");
        int certainNumber = sc.nextInt();

        boolean found = false;
        for (int value : array) {
            if (value == certainNumber) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Number found");
        else
            System.out.println("Number not found");
    }
}




