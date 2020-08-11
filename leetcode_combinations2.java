class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(n==0 || k==0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[10];
        sum3(k,n,res,ans,vis,0,0,1);
        return res;
    }
    
    public void sum3(int k,int n,List<List<Integer>> res,List<Integer> ans,boolean[] vis,int count,int asf,int idx){
        if(count == k){
            if(asf == n){
                ArrayList<Integer> val = new ArrayList<>(ans);
                res.add(val);
            }
            return;
        }
        
        for(int i=idx;i<=9;i++){
            if(!vis[i] && asf+i<=n){
                vis[i] = true;
                ans.add(i);
                sum3(k,n,res,ans,vis,count+1,asf+i,i);
                ans.remove(ans.size()-1);
                vis[i] = false;
            }
        }
    }
}
