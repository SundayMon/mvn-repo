/**
 * Created by sunday on 2016/11/7.
 */
public interface IUF {
    void union(int p, int q);
    int find(int p);
    boolean connected(int p, int q);
    int count();
}
