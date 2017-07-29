/**
 * Created by sunday on 2016/11/7.
 */
public class UF implements IUF{
    private int arrs[];
    private int count;

    public UF(int n) {
        arrs = new int[n];
        count = n;
        for (int i=0; i<n; i++) {
            arrs[i] = i;
        }
    }


    public void union(int p, int q) {
        
    }

    public int find(int p) {
        return 0;
    }

    public boolean connected(int p, int q) {
        return arrs[p] == arrs[q];
    }

    public int count() {
        return count;
    }
}
