import java.util.ArrayList;

class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    float ipk;

    Mahasiswa(String nama, String nim, String prodi, float ipk) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.ipk = ipk;
    }
}

class ArrayListMahasiswa {
    ArrayList<Mahasiswa> mahasiswaList;

    public ArrayListMahasiswa() {
        mahasiswaList = new ArrayList<>();
    }

    public void addMahasiswa(String nama, String nim, String prodi, float ipk) {
        Mahasiswa newMhs = new Mahasiswa(nama, nim, prodi, ipk);
        mahasiswaList.add(newMhs);
    }

    public void removeMahasiswa(String nim) {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }

        for (int i = 0; i < mahasiswaList.size(); i++) {
            if (mahasiswaList.get(i).nim.equals(nim)) {
                mahasiswaList.remove(i);
                System.out.println("Mahasiswa dengan NIM " + nim + " dihapus dari daftar Mahasiswa.");
                return;
            }
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak di temukan dalam daftar mahasiswa");
    }

    public void displayMahasiswa() {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }

        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaList) {
            System.out.println("Nama: " + mhs.nama + ", NIM: " + mhs.nim + ", Prodi: " + mhs.prodi + ", IPK : " + mhs.ipk);
        }
    }

    public void searchMahasiswa(String nim) {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }

        for (Mahasiswa mhs : mahasiswaList) {
            if (mhs.nim.equals(nim)) {
                System.out.println("Data Mahasiswa ditemukan: ");
                System.out.println("Nama: " + mhs.nama + ", NIM: " + mhs.nim + ", Prodi: " + mhs.prodi + ", IPK : " + mhs.ipk);
                return;
            }
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }
}

public class dMhsArrayList {
    public static void main(String[] args) {
        ArrayListMahasiswa list = new ArrayListMahasiswa();
        
        //data mahasiswa jika kosong
        System.out.println("=== Data Mahasiswa ===");
        list.displayMahasiswa();
        System.out.println("");


        //menambah data mahasiswa
        list.addMahasiswa("Rizky", "111", "Teknik Informatika", 3.36f);
        list.addMahasiswa("Lindo", "112", "Teknik Iformatika", 3.35f);
        list.addMahasiswa("Rafa", "113", "Teknik Informatika", 3.40f);
        list.addMahasiswa("Ihsan", "114", "Teknik Informatika", 3.35f);
        System.out.println("=== Data Mahasiswa Setelah Ditambahkan ===");
        list.displayMahasiswa();
        System.out.println("");


        //menghapus data mahasiswa
        System.out.println("=== Sebelum Menghapus Data Mahasiswa ===");
        list.displayMahasiswa();
        System.out.println("");

        //menghapus data mahasiswa dengan NIM 111
        list.removeMahasiswa("111");
        System.out.println("");
        
        System.out.println("=== Data Mahasiswa Setelah Dihapus ===");
        list.displayMahasiswa();
        System.out.println("");

        //mencari data mahasiswa dengan NIM 112
        System.out.println("=== Mencari Data Mahasiswa ===");
        list.searchMahasiswa("112");


        list.removeMahasiswa("111");
        System.out.println("");


        System.out.println("=== Data Mahasiswa Setelah Dihapus ===");
        list.displayMahasiswa();
        System.out.println("");

        
        //mencari data mahasiswa
        System.out.println("=== Mencari Data Mahasiswa ===");
        list.searchMahasiswa("112");
        System.out.println("");
    }
}
