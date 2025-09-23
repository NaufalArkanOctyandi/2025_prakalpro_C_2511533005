package pekan2;

public class MenentukanPresentaseMendapatkanCharacterB5 {
    public static void main(String[] args) {

        double peluang_S = 0.6;
        double peluang_R = 3.4;
        double peluang_C = 96.0;

        int nomor_spin = 21;

        boolean isMendapatkan_S;
        char hasil;
        double probabilitas;

        if (nomor_spin < 90) {
            probabilitas = peluang_S;
            isMendapatkan_S = false;
            hasil = 'C';

            System.out.println("Nomor spin = " + nomor_spin);
            System.out.println("Probabilitas mendapatkan karakter bintang 5 = " + probabilitas + "%");
            System.out.println("Hasil karakter = " + hasil);

        } else if (nomor_spin == 90) {
            probabilitas = 100;
            isMendapatkan_S = true;
            hasil = 'S';

            System.out.println("Nomor spin = " + nomor_spin);
            System.out.println("Probabilitas mendapatkan karakter bintang 5 = " + probabilitas + "%");
            System.out.println("Hasil karakter = " + hasil);
        }
    }
}
