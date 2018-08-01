public class robot {
    private int moneda = 0;
    private int direccion = 0;
    private int posx = 0;
    private int posy = 0;
    private static final int verder = 0;
    private static final int verup = 1;
    private static final int verizq = 2;
    private static final int verab = 3;
    private moneda coin;

    public robot (int moneda, int posx, int posy){
        this.moneda = moneda;
        this.posx = posx;
        this.posy = posy;
        this.direccion = robot.verder;
        this.moneda = new moneda();
    }
    private boolean recoger(){
        while(moneda ¡= coin.getAmount()){
            coin  = coin + 1;
        }
        return (false);

    }
    public int getCoin(){return moneda;}
    public int getDireccion(){return direccion;}
    public int getPosx(){return posx;}
    public int getPoy(){return posy;}

    public int Cambiar(){
        if (this.direccion==verder){
            this.direccion=verder;
            return this.direccion;
        }
        if (this.direccion==verup) {
            this.direccion = verup;
            return this.direccion;
        }
        if (this.direccion==verizq) {
            this.direccion = verizq;
            return this.direccion;
        }
        if (this.direccion==verab) {
            this.direccion = verab;
            return this.direccion;
        }
        return this.direccion;
    }
    @Override
    public String toString(){
        switch(this.direccion){
            case robot.verder: return ">";
            case robot.verup: return "|";
            case robot.verizq: return "<";
            case robot.verab: return "V";
            default: return "";
        }
    }
}
