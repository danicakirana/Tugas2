public class Tabung extends Lingkaran implements MenghitungRuang{

    private double tinggi;

    public Tabung(double r, double t) {
        super(r);
        tinggi = t;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double Volume() {
        return PHI * (super.getRadius() * super.getRadius()) * tinggi;
    }

    @Override
    public double LuasP() {
        return 2 * (MenghitungBidang.PHI * super.getRadius()) * (super.getRadius() + tinggi);
    }

}