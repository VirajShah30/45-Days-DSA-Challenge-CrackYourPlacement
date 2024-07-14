class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int diff = a.get(a.size()-1) - a.get(0);
        for(int i = 0; i <= a.size()-m; i++)
        {
            if(a.get(m+i-1) - a.get(i) < diff)
                diff = a.get(m+i-1) - a.get(i);
        }
                        + a); 
        return diff;
    }
}
