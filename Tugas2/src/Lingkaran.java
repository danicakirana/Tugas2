public class Lingkaran implements MenghitungBidang{
    private double Radius;

    public Lingkaran(double r){

        Radius = r;
    }

    //Encapsulation
    public void setRadius(double r){
        Radius = r;
    }

    public double getRadius(){
        return Radius;
    }

    public double getDiameter(){
        return 2*Radius;
    }

    @Override
    public double Luas() {
        return PHI * (Radius * Radius);
    }
    @Override
    public double Keliling() {
        return PHI * (2*Radius);
    }
}