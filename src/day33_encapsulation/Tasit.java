package day33_encapsulation;

public class Tasit {

    private String tasitTuru;
    private Boolean muayenesiVarMi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;

        // getter method'u tek satirlik islem yapiyor ve baska classlar
        // public olan getter methoduna ulasiyor, getter class icerisindeki
        // private verileri alip diger class'lara donduruyor
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }

    public void setMuayenesiVarMi(Boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
