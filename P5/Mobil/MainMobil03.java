package P5.Mobil;

public class MainMobil03 {
    public static void main(String[] args) {
        Mobil03[] mobil = {
                new Mobil03("BMW", "M2 Coupe", 2016, 6816, 728),
                new Mobil03("Ford", "Fiesta ST", 2014, 3921, 575),
                new Mobil03("Nissan", "370Z", 2009, 4360, 657),
                new Mobil03("Subaru", "BRZ", 2014, 4058, 609),
                new Mobil03("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Mobil03("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Mobil03("Toyota", "86/GT86", 2014, 4180, 609),
                new Mobil03("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };
        int maxAcceleration = Mobil03.cariMaxAcceleration(mobil, 0, mobil.length - 1);
        int minAcceleration = Mobil03.cariMinAcceleration(mobil, 0, mobil.length - 1);
        double avgPower = Mobil03.hitungRataPower(mobil);

        System.out.println("Top acceleration tertinggi : " + maxAcceleration);
        System.out.println("Top acceleration terendah  : " + minAcceleration);
        System.out.println("Rata-rata top power        : " + avgPower);

    }
}
