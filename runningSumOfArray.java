import java.util.Scanner;
import java.util.Arrays;

public class runningSumOfArray {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            int size = sc.nextInt();

            int[] nums = new int[size];
            int[] ans = new int[nums.length];
            ans[0] = nums[0];

            for (int i = 1; i < nums.length; i++) {
                nums[i] = sc.nextInt();
                ans[i] = ans[i - 1] + nums[i];
            }

            System.out.println(Arrays.toString(ans));

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
