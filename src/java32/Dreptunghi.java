package java32;

public class Dreptunghi extends ObiecteGrafice {

    double lungime;

    double latime;

    public Dreptunghi(double x, double y, double lungime ,double latime) {
        super(x, y);
        this.lungime = lungime;
    }


    @Override
    public double arie() {
        return latime * lungime;
    }

    @Override
    public double perimertu() {
        return 2 * (lungime + latime);
    }
}
