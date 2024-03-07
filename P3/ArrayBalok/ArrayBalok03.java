package P3.ArrayBalok;

public class ArrayBalok03 {
    public static void main(String[] args) {
        Balok03[] blArray = new Balok03[3];

        blArray[0] = new Balok03(100, 30, 12);
        blArray[1] = new Balok03(120, 40, 15);
        blArray[2] = new Balok03(210, 50, 25);

        for (int i = 0; i < blArray.length; i++){
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
}
