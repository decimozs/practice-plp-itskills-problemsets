import java.util.Scanner;

public class countNegatives {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            int x = sc.nextInt();
            int c = 0;

            for(int i = 0; i < x; i++) {
                int n = sc.nextInt();
                if (n < 0) 
                c++;
            }
               
            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
