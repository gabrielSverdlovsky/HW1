public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int size=m.length;
        if (i==j) return 0;
        int[] current=new int[size];
        current[i]=1;
        for (int dist=1;dist<size;dist++){
            int[] next=new int[size];
            for (int k=0;k<size;k++){
                if (current[k]==1){
                    for (int q=0;q<size;q++){
                        if (m[k][q]==1){
                            next[q]=1;
                        }
                    }
                }
            }
            if (next[j]==1) return dist;
            current=next;
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}