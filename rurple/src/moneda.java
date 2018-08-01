public class moneda {
    private int posx1 = 0;
    private int posy1 = 0;
    private int val = 0;
    private static final int max = 10;
    private static final int min = 0;

    public moneda(int posx1,int posy1, int val ){
        this.posx1 = posx1;
        this.posy1 = posy1;
        this.val = val;
    }
    public moneda(){
    }
    public int getAmount() {return val; }
    public int getPosx1() {return posx1; }
    public int getPosy1() {return posy1; }

    private boolean recoger(){
        while (val != min){
            val = val-1;
        }
        return (false);

    }
    private boolean nada(){
        while (val > max){
            return (false);
        }
        return (true);

    }

}
