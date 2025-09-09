package pekan1;

public class MembuatKue {

	public static void main(String[] args) {
		makeBatter();
		memanggang();
		memanggang();
		menghias();

	}
	// Langkah 1: Buat adonan kue.
	public static void makeBatter() {
		System.out.println("Campur bahan kering.");
		System.out.println("Krim mentega dab gula.");
		System.out.println("Kocok telurnya.");
		System.out.println("Masuk bahan kering.");
	}
	
	// Langkah 2: Panggang sekumpulan kue.
	public static void memanggang() {
		System.out.println("Setel suhu open.");
		System.out.println("Setel pengatur waktu.");
		System.out.println("Masukkan kue ke dalam oven.");
		System.out.println("Biarkan cookie untuk dipanggang.");
	}
	// Langkah 3: Hiasi cookie.
	public static void menghias() {
		System.out.println("Campur bahan untuk froasting.");
		System.out.println("Taburkan froasting dan taburan.");
	}
		
	}
