import java.util.*;

public class SpiralMatrix {
    public static void main(String [] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int[n][m];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println("Ended");
        }

        int minr = 0;
        int minc = 0;

        int maxr = arr.length-1;
        int maxc = arr[0].length-1;

        int tne = m*n;
        int cnt = 0;

        while(cnt <= tne){
            // left wall
            for(int i = minr, j=minc; i<=maxr && cnt < tne; i++){
                System.out.println(arr[i][j]);
                cnt+=1;
            }
            minc+=1;

            // bottom wall
            for(int i= maxr, j=minc; j<=maxc && cnt < tne; j++){
                System.out.println(arr[i][j]);
                cnt+=1;
            }
            maxr-=1;

            // right wall
            for(int i=maxr, j=maxc; i>=minr && cnt < tne; i--){
                System.out.println(arr[i][j]);
                cnt+=1;
            }
            maxc-=1;

            // top wall
            for(int i=minr, j=maxc; j>=minc && cnt < tne; j--){
                System.out.println(arr[i][j]);
                cnt+=1;
            }
            minr+=1;

        }
        sc.close();
    }
}
