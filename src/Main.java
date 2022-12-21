import Servis.Servis;
import Transport.Air.Plane;
import Transport.Ground.Bus;
import Transport.Ground.Truck;
import Transport.Transport;
import country.City;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[]
        int choice;
        Bus mercedes_Benz_O530GL_CapaCity = new Bus(120, 13, 37, 0.4);
        Truck mercedes_Benz_Actros = new Truck(162, 135, 2, 1.3);
        City minsk = new City(  "Minsk",true, true, 27.5667,53.9 );
        City vitebsk = new City("Vitebsk",true, true,  30.2049,55.1904);
        City gomel = new City("Gomel",true, true,  30.9754,52.4345);
        City mogilev = new City("Mogilev",true, true,  30.3449,53.9168);
        City grodno = new City("Grodno",true, true,  23.8258,53.6884);
        City brest = new City("Brest",true, true,  23.6877,52.0975);
        City moscow = new City("Moscow",true, true, 37.6156,55.7522 );
        City saintPetersburg = new City("SaintPetersburg",true, true,  30.3141,59.9386);
        City kaliningrad = new City("Kaliningrad",true, true,  20.511,54.7065);
        City novosibirsk = new City("Novosibirsk",true, true,  82.9346,55.0415);
        City ekatetinburg = new City("Ekatetinburg",true, true,  60.6122,56.8519);
        City vladivostok = new City("Vladivostok",true, true,  131.874,43.1056);
        //украинские города
        City kiev = new City("Kiev",true, true,   30.5238,50.4547);
        City odessa = new City("Odessa",true, true,   30.72331,46.48253);
        City lviv = new City("Lviv",true, true,   24.0232,49.8383);
        City[] cities = {minsk, vitebsk, gomel, mogilev, grodno, brest, moscow, saintPetersburg, kaliningrad, novosibirsk, ekatetinburg, vladivostok, kiev, odessa, lviv};
        Plane boeing737Passenger = new Plane(1.5, 2526, 850, 186);
        Plane boeing737Cargo = new Plane(23, 3000, 850, 0);
        Plane boeing747Passenger = new Plane(0, 12000, 933, 660);
        Plane boeing747Cargo = new Plane(128.5, 12000, 933, 0);//фуры
        Truck volvoFH16 = new Truck(325, 22.68, 90, 0);
        Transport[] transports = {mercedes_Benz_O530GL_CapaCity, mercedes_Benz_Actros, boeing737Cargo, boeing747Cargo, boeing737Passenger, boeing747Passenger, volvoFH16};
        boolean run = true;
        String option;
        while (run) {
            for (int i = 0; i< 15; i++) {
                System.out.println(i+1 + ") " + cities[i]);
            }
            int number = 1;
            System.out.println();
            System.out.print("Введите номер города отправления: ");
            number = in.nextInt();
            City departureCity = cities[number - 1];
            System.out.print("Введите номер города доставки: ");
            number = in.nextInt();
            City arrivalCity = cities[number - 1];
            System.out.print("Введите вес груза: ");
            double load = in.nextDouble();
            System.out.print("Введите количество пассажиров: ");
            int passengers = in.nextInt();
            System.out.println();
            //Transport[] bestTransports = ( passengers, departureCity, arrivalCity);
            System.out.println("Самый быстрый: ");
            //System.out.println(bestTransports[0]);
            System.out.println();
            System.out.println("Самый дешёвый: ");
            //System.out.println(bestTransports[1]);
            System.out.print("Введите '0' для выхода: ");
            option = in.next();
            if (option.equals("0")) {
                run = false;
            }
        }


    }
}