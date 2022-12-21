package country;

public class City {
    private String name;
    private boolean  hasAirport;
    private boolean  hasSeaport;
    private double longitude;
    private double latitude;
    public City( String name ,
                 boolean hasAirport,
                     boolean hasSeaport,
                     double longitude,
                     double latitude){
        this.name = name;
        this.hasAirport = hasAirport;
        this.hasSeaport = hasSeaport;
        this.longitude = longitude;
        this.latitude = latitude;

    }

    public boolean isHasAirport() {
        return hasAirport;
    }

    public void setHasAirport(boolean hasAirport) {
        this.hasAirport = hasAirport;
    }

    public boolean isHasSeaport() {
        return hasSeaport;
    }

    public void setHasSeaport(boolean hasSeaport) {
        this.hasSeaport = hasSeaport;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }


}
