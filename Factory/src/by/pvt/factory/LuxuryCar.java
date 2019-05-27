package by.pvt.factory;

class LuxuryCar implements Car {

    private int speedlimit = 1000;
    private CarType model = CarType.LUXURY;

    public void setModel(CarType model) {
        this.model = model;
    }

    public CarType getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "LuxuryCar{" +
                "speedlimit=" + speedlimit +
                ", model=" + model +
                '}';
    }

    public void construct() {
       this.speedlimit = 7000;
    }
}
