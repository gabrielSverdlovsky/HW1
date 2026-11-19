public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int q=Integer.parseInt((String)args[0]);
        int r=1;
        for (int i=0; i<q; i++){
            approxPi += Math.pow(-1,i)*(double)1/r;
            r+=2;
        }
        approxPi *= 4;
        System.out.println(approxPi + " " + actualPi);  
    }
}
