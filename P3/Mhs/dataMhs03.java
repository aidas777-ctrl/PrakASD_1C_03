package P3.Mhs;

public class dataMhs03 {
    public String nama;
    public String NIM;
    public char jenisKelamin;
    public double IPK;

    public dataMhs03() {

    }

    public dataMhs03(String nama, String nim, char JenisKel, double ipk) {
        this.nama = nama;
        NIM = nim;
        jenisKelamin = JenisKel;
        IPK = ipk;

    }

    public void tampilInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Nilai IPK : " + IPK);
    }

    public double getIPK() {
        return IPK;
    }
}
