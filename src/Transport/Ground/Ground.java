package Transport.Ground;

import Transport.Transport;

public class Ground extends Transport {
    public Ground (double speed,
                  double loadCapacity,
                  int passengers,
                  double priceByKm){
        super (speed,  passengers,loadCapacity, priceByKm);
    }
}
