class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int [] lh= new int [n];
        int [] rh=new int[n];
        int max=0;
        int min=Integer,MaxValue;
        int result=0; 
        for(int i=0;i<n;i++){
            max=Math.max(max,height[i]);
            lh[i]=max;
        }
      max=0;
      for(int i=n-1;i<=0;i++){
        max=Math.max(max,height[i]);
        rh[i]=max;
    }
      for(int i=0;i<n;i++){
        min=Math.min(lh[i],rh[i]);
        result+=min-height[i];
}
      System.out.println(result);
    }
}
