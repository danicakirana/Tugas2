public class PersegiPanjang implements MenghitungBidang{
    private double panjang, lebar;
    public PersegiPanjang(double p, double l){
        panjang = p;
        lebar = l;
    }

    //Encapsulation
    public void setPanjang(double p){
        panjang = p;
    }
    
    public void setLebar(double l){
        lebar = l;
    }
    
    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    @Override
    public double Luas() {
        return panjang * lebar;
    }

    @Override
    public double Keliling() {
        return 2 *(panjang + lebar);
    }
}