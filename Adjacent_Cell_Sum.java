// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int grid= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        int row=sc.nextInt();
        int col=sc.nextInt();
        int diff[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        long sum=0;
        for(int i=0;i<8;i++){
            int ar=row+diff[i][0];
            int ac=col+diff[i][1];
            if((ar>=0&&ar<row)&&(ac>=0 && ac<col)){
                sum+=grid[ar][ac];
            }
        }
        System.out.println(sum);
    }
}
