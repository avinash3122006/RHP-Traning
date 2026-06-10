import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the 1st str:");
        String s1=sc.nextLine();
        System.out.println("enter the 2nd str:");
        String s2=sc.nextLine();
        int r=s1.length();
        int c=s2.length();
        int max=0;
        int [][] dp= new int[r+1][c+1];
        for(int i=0;i<r+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<c+1;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    max=Math.max(max,dp[i][j]);
                }
            }
        }
        System.out.println(max);
    }
}
