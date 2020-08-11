class Solution {
    public List<List<Integer>> combine(int n, int k) {
        if(n==0 || k==0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[n+1];
        comb(n,k,res,ans,0,vis,1);
        return res;
    }
    
    public void comb(int n,int k,List<List<Integer>> res, List<Integer> ans,int count,boolean[] vis,int idx){
        if(count == k){
            ArrayList<Integer> val = new ArrayList<>(ans);
            res.add(val);
            return;
        }
        for(int i=idx;i<=n;i++){
            if(!vis[i]){
                ans.add(i);
                vis[i] = true;
                comb(n,k,res,ans,count+1,vis,i);
                ans.remove(ans.size()-1);
                vis[i] = false;
            }
        }
    }
}
