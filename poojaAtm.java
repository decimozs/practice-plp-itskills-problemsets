import java.util.Scanner;
import java.text.DecimalFormat;

public class poojaAtm {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("#.00");

            int w = sc.nextInt();
            double b = sc.nextDouble();

            if (w % 5 == 0 && w > b) {
                System.out.println(df.format(b - w - 0.5));
            } else {
                System.out.println(df.format(b));
            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
