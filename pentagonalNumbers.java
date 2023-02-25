public class pentagonalNumbers {
    
    public static Integer pentagonalNumbers(int x) {
        return (x * (3 * x - 1)) / 2 ;
    }

    public static void main(String[] args) {
        
        for (int i = 0; i <= 50; i++) {
            System.out.printf("%-6d", pentagonalNumbers(i));
            if (i % 10 == 0) 
            System.out.println();
        }
    }

}
