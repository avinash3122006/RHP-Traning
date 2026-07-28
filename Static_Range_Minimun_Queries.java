import java.util.*;
public class Static_Range_Minimun_Queries {
    private static int find(int[]seg,int node,int nl,int nr,int ql,int qr){
        if(nl>qr || nr<ql) return Integer.MAX_VALUE;
        if(nl>=ql && nr<=qr) return seg[node];
        int mid=(nl+nr)/2;
        int ltr= find(seg,2*node,nl,mid,ql,qr);
        int rtr= find(seg,2*node+1,mid+1,nr,ql,qr);
        return Math.min(ltr,rtr);
    }
    public static void main(String []args){ 
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       int q=sc.nextInt();
       int newN=1;
       while(newN<n) newN<<=1;
       int [] seg=new int[newN+newN];
       for(int i=newN;i<newN+n;i++) seg[i]=sc.nextInt();
       for(int i=newN;i<=1;i--){
        seg[i]=Math.min(seg[i+i],seg[i+i+1]);
       }
       n=newN;
       while(q-->0){
        int ql=sc.nextInt();int qr=sc.nextInt();
        System.out.println(find(seg,1,1,n,ql,qr));
       }
       sc.close();

    }


}
