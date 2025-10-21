import java.util.Scanner;

public class SecondLargest {
    private int[] array;
    Scanner sc = new Scanner(System.in);


    public void setLength() {
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        array = new int[length];
    }


    public void setElements() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element [" + i + "]: ");
            array[i] = sc.nextInt();
        }
    }


    public void findSecondLargest() {
        if (array.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }


        System.out.println("Second largest element = " + array[1]);
    }

}


