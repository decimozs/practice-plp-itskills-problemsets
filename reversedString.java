import java.util.Scanner;

public class reversedString {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)){

            String t = sc.nextLine();
            String r = "";

            char ch;

            for(int i = 0; i < t.length(); i++) {
                ch = t.charAt(i);
                r = ch + r;
            }

            System.out.println(r);

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

}
