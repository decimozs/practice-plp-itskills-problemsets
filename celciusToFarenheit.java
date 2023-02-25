import java.util.Scanner;

public class celciusToFarenheit {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            float c = sc.nextFloat();

            float f = (float) ((c * 1.8) + 32);

            System.out.println(f);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
