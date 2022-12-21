package Transport.Sea;

import Transport.Transport;

public class Sea extends Transport {
    public Sea (double speed,
                  double loadCapacity,
                  int passengers,
                  double priceByKm){
        super (speed,  passengers,loadCapacity, priceByKm);
    }
}
