import java.util.Scanner;

public class farenheitToCelcius {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            float f = sc.nextFloat();

            float c = ((f - 32) *5) /9;

            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
