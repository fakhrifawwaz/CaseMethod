import java.util.Scanner;

public class CM_15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Input data Mahasiswa
        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.println("Nama : ");
        String nama = sc.next();
        System.out.println("NIM : ");
        String nim = sc.next();


        System.out.println("=== PENENTUAN KELULUSAN MAHASISWA ===");
        
        //Masukkan nilai mata kuliah Algoritma dan Pemograman
        System.out.println("\nMasukkan nilai untuk mata kuliah Algoritma dan Pemrograman:");
        System.out.print("Nilai UTS : ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS : ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = sc.nextDouble();

        //menghitung nilai akhir mata kuliah Algoritma dan Pemrograman
        double nilaiAkhir1 = (0.3 * uts1) + (0.4 * uas1) + (0.3 * tugas1);
        
        //pemilihan apakah mahasiswa tersebut lulus atau tidak
        if (nilaiAkhir1 >= 60) {
            System.out.println("LULUS");
        }else {
            System.out.println("TIDAK LULUS");
        }
        //mengubah nilai akhir mahasiswa menjadi nilai huruf
        if (nilaiAkhir1 >= 80) {
            System.out.println("A");
        }else if (nilaiAkhir1 >= 73) {
            System.out.println("B+");
        }else if (nilaiAkhir1 >= 65) {
            System.out.println("B");
        }else if (nilaiAkhir1 >= 60) {
            System.out.println("C+");
        }else if (nilaiAkhir1 >= 50) {
            System.out.println("C");
        }else if (nilaiAkhir1 >= 39) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }

        //Masukkan nilai mata kuliah Struktur Data
        System.out.println("\nMasukkan nilai untuk mata kuliah Struktur Data:");
        System.out.print("Nilai UTS : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = sc.nextDouble();

        //Menghitung nilai akhir mata kuliah struktur data
        double nilaiAkhir2 = (0.3 * uts2) + (0.4 * uas2) + (0.3 * tugas2);

        //pemilihan apakah mahasiswa tersebut lulus atau tidak
        if (nilaiAkhir2 >= 60) {
            System.out.println("LULUS");
        }else {
            System.out.println("TIDAK LULUS");
        }
        //mengubah nilai akhir mahasiswa menjadi nilai huruf
        if (nilaiAkhir2 >= 80) {
            System.out.println("A");
        }else if (nilaiAkhir2 >= 73) {
            System.out.println("B+");
        }else if (nilaiAkhir2 >= 65) {
            System.out.println("B");
        }else if (nilaiAkhir2 >= 60) {
            System.out.println("C+");
        }else if (nilaiAkhir2 >= 50) {
            System.out.println("C");
        }else if (nilaiAkhir2 >= 39) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }

        //Menghitung rata-rata kedua mata kuliah
        System.out.println("=== Rata-rata nilai akhir ===");
        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
        System.out.println("Rata - rata nilai akhir mahasiswa adalah : " +rataRata);
        
        //Status kelulusan mata kuliah
        System.out.println("-----------------------------");
        System.out.println("Nama : " +nama);
        System.out.println("NIM : " +nim);
        System.out.println("Masukkan status mata kuliah 1 (LULUS/TIDAK): ");
        String status1 = sc.next();
        System.out.println("Masukkan status mata kuliah 2 (LULUS/TIDAK): ");
        String status2 = sc.next();

        System.out.println("=== Status Kelulusan ===");
        //Nested if
        if (status1.equalsIgnoreCase("LULUS") && status2.equalsIgnoreCase("LULUS")) {
            if (rataRata >= 70) {
                System.out.println("Status Semester: LULUS");
            }else {
                System.out.println("Status Semester: TIDAK LULUS");
            }
                
        }else {
            System.out.println("Status Semester: TIDAK LULUS");
        }

        sc.close();
        
    }
}