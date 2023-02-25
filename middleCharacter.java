import java.util.Scanner;

class middleCharacter {
    
    public static String middle (String str) {
        int p = 0;
        int l = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.length() % 2 == 0) {
                    p = str.length() / 2 - 1;
                    l = 2;
            } else {
                p = str.length() / 2;
                l = 1;
            }
        }
        return str.substring(p,p + l);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a word: ");
            String word = sc.nextLine();
            System.out.println("The middle character is: " + middle(word));


        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
