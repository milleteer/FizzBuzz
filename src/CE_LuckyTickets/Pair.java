package CE_LuckyTickets;

/**
 * Created by gkoles on 2016.02.06..
 */
public class Pair {
    private int l;
    private int r;

    public Pair(int l,int r){
        this.l = l;
        this.r = r;
    }
    public int getL(){ return l; }
    public int getR(){ return r; }
    public void setL(int l){ this.l = l; }
    public void setR(int r){ this.r = r; }

    public boolean compareLR (){
        if (this.r == this.l) return true;
        else return false;
    }
}
