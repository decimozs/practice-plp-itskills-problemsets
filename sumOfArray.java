import java.util.Scanner;

public class sumOfArray {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();

            int[] arr = new int[size];
            int sum = 0;
        

            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            System.out.println("The sum of array is " + sum);

        } catch (Exception e) {
            System.out.println(e);
        }

        
    }

}
