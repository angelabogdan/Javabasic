package java32;

public  class Cerc extends ObiecteGrafice {

    double raza;

    public Cerc(double raza, double x, double y){
        super(x, y);
        this.raza =raza;
    }





    @Override
    public double arie() {
        return Math.PI * raza * raza;
    }

    @Override
    public double perimertu() {
        return 2 * Math.PI * raza;
    }
}
