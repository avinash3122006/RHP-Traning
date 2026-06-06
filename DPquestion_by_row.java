import java.util.*;

public class Dynamic_Progrmming {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
        int c= sc.nextInt();
        int arr [][] =new int[r][c];
        int dp[][] = new int[r][c] ;
        int max1=0;
        int max2=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
            if(i==0){
                dp[i][j]=arr[i][j];
            }
            }
        }
        for(int i=1;i<r;i++){
            int fsmax[]=getfs(dp,i-1,c);
            for(int j=0;j<c;j++){
                dp[i][j]=arr[i][j]+(dp[i-1][j]==fsmax[0]?fsmax[1]:fsmax[0]);

                            }
                        }
        System.out.println(getfs(dp,r-1,c)[0]);

    }
                    private static int[] getfs(int[][] dp, int i, int c) {
                        // TODO Auto-generated method stub
                        int max1=0;
                        int max2=0;
                        int[]fs=new int[2];
                        for(int j=0;j<c;j++){
                        if(dp[i][j]>max1){
                            max2=max1;
                            max1=dp[i][j];
                        }
                        else if(dp[i][j]>max2){
                            max2=dp[i][j];
                        }
                        }
                        fs[0]=max1;
                        fs[1]=max2;
                        return fs;
                    }
}
