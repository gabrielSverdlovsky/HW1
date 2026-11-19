public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String arg : args) {
            char x=arg.charAt(0);
            if ((int) x%5==0) System.out.println(x);
        }
    }
}

