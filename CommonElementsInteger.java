import java.util.Scanner;

public class CommonElementsInteger {
    private int[] array1;
    private int[] array2;
    Scanner sc = new Scanner(System.in);


    public void setLength() {
        System.out.print("Enter the length of first array: ");
        int length1 = sc.nextInt();
        array1 = new int[length1];

        System.out.print("Enter the length of second array: ");
        int length2 = sc.nextInt();
        array2 = new int[length2];
    }


    public void setValues() {
        System.out.println("Enter elements for first array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Array1[" + i + "]: ");
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter elements for second array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Array2[" + i + "]: ");
            array2[i] = sc.nextInt();
        }
    }


    public void findCommon() {
        System.out.println("Common elements between both arrays:");
        boolean found = false;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found)
            System.out.println("No common elements found");
    }
}




