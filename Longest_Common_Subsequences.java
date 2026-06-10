class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int r=text1.length();
        int c= text2.length();
        int max=0;
        int[][] dp=new int [r+1][c+1];
        for(int i =0;i<r+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=c;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
                max=Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
}
