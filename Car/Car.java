public class Car {
    private double fuelAmount;
    private double fuelCapacity;
    private double fuelConsumption;
    private Point location;
    private String model;

    public Car(double capacity, double consumption, Point location, String model) {
        this.fuelAmount = capacity;
        this.fuelCapacity = capacity;
        this.fuelConsumption = consumption;
        this.location = location;
        this.model = model;
    }

    public Car(double capacity, double consumption, double x, double y, String model) {
        this(capacity, consumption, new Point(x, y), model);
    }

    public Car() {
        this(60, 0.6, new Point(0, 0), "Mercedes");
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public Point getLocation() {
        return location;
    }

    public String getModel() {
        return model;
    }

    public void drive(Point destination) throws OutOfFuelException {
        double fuelNeed = location.distance(destination) * fuelConsumption;
        double newFuelAmount = fuelAmount - fuelNeed;
    
        if ( newFuelAmount < 0 ) {
            throw new OutOfFuelException();
        }
        fuelAmount = newFuelAmount;
        location = destination;
    }

    public void drive(double x, double y) throws OutOfFuelException {
        drive(new Point(x, y));
    }

    public void refill(double fuel) throws ToMuchFuelException {
        double newFuel = fuelAmount + fuel;
    
        if ( newFuel > fuelCapacity ) {
            throw new ToMuchFuelException();
        }
        fuelAmount = newFuel;
    }

    public String toString() {
        StringBuffer out = new StringBuffer();

        out.append("Car: " + model + "\n");
        out.append("Location: " + location + "\n");
        out.append("Fuel: " + fuelAmount + "/" + fuelCapacity + "\n");
        out.append("Consumption: " + fuelConsumption + "\n");

        return out.toString();
    }
}
