public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int numOdd = 0;
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int current=1;
        int previous=1;
        for (int i = 0; i < x; i++) {
            if (i<2){
                System.out.print(current);
            }
            else {
                int temp=current;
                current=current+previous;
                previous=temp;
                System.out.print(current);
            }
            if (i < x - 1) System.out.print(" ");
            if (current% 2 != 0) {
                numOdd++; 
            }
        

        }
        System.out.println("\nThe number of odd numbers is: " + numOdd);
    }
}
