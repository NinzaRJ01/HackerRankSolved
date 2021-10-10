class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;    
        int[] res = new int[n+m];
        while(i<m&&j<n){
            if(nums1[i]<nums2[j])res[k]=nums1[i++];
            else res[k]=nums2[j++];
            k++;             
        }
        while(i<m)res[k++]=nums1[i++];
        while(j<n)res[k++]=nums2[j++];
        for(i=0;i<n+m;i++)nums1[i]=res[i];
        
    }
}
