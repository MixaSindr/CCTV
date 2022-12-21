package Transport.Air;

import Transport.Air.Air;

public class Plane extends Air {
    public Plane (double speed,
                  double loadCapacity,
                  int passengers,
                  double priceByKm){
        super (speed,  passengers,loadCapacity, priceByKm);
    }
}
