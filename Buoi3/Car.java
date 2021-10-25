public class Car {
    private String mauSac;
    private int banhXe;
    
    public Car() {
        mauSac = " ";
        banhXe = 0;
    }
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public String getMauSac() {
        return mauSac;
    }
    public void setSoBanhXe(int soBanhXe) {
        this.banhXe = soBanhXe;
    }
    public int getSoBanhXe() {
        return banhXe;
    }
    public Car(String mauSac,int banhXe) {
        this.mauSac = mauSac;
        this.banhXe = banhXe;
    }

    public void diThang() {
        System.out.println("Xe Di Thang");
    }

    public void diLui() {
        System.out.println("Xe Di Lui");
    }
}
