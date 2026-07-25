class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplet= new ArrayList<>();
        int n=nums.length;
        Set<List<Integer>> s=new HashSet<>();
        for(int i=0;i<n-2;i++){
            if(nums[i]>0) break;
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        triplet.addAll(s);
        return triplet;
    }
}
