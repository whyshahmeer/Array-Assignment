import java.util.Scanner;

public class ItterationArray {
    private int[] originalArray;
    private int[] copiedArray;
    Scanner sc = new Scanner(System.in);


    public void setLength() {
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        originalArray = new int[length];
        copiedArray = new int[length];
    }


    public void setValues() {
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print("Enter value for Array[" + i + "]: ");
            originalArray[i] = sc.nextInt();
        }
    }


    public void copyArray() {
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }


        System.out.println("Original Array Elements:");
        for (int value : originalArray) {
            System.out.print(value + " ");
        }

        System.out.println("Copied Array Elements:");
        for (int value : copiedArray) {
            System.out.print(value + " ");
        }
    }
}



