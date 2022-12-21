package Transport;

public class Transport {
    private int passengers;
    private double speed;
    private double loadCapacity;
    private double priceByKm;
    public Transport(double speed,
                     int passengers,
                     double loadCapacity,
                     double priceByKm){
        this.speed = speed;
        this.loadCapacity = loadCapacity;
        this.passengers = passengers;
        this.priceByKm = priceByKm;

    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getPriceByKm() {
        return priceByKm;
    }

    public void setPriceByKm(double priceByKm) {
        this.priceByKm = priceByKm;
    }
    public String toString() {
        return "by.my.transport.Transport{"+
                "speed" + speed +
                ", loadCapacity" + loadCapacity +
                ", passengers" + passengers +
                ", priceByKm" + priceByKm +"}";
    }
}
