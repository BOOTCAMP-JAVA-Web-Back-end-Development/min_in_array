import java.util.Scanner;

public class min_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, min;
        int[] array;
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        min = array[0];
        for (int j : array){
            if(j < min){
                min = j;
            }
        }
     System.out.println("Min element of array is : " + min);
    }
}
