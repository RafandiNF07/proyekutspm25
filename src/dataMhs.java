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
class Node {
    Mahasiswa data;
    Node next;

    Node(Mahasiswa data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListMahasiswa {
    Node head;

    public void addMahasiswa(String nama, String nim, String prodi, float ipk) {
        Mahasiswa newMhs = new Mahasiswa(nama, nim, prodi, ipk);
        Node newNode = new Node(newMhs);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void removeMahasiswa(String nim) {
        if (head == null) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }
        if (head.data.nim.equals(nim)) {
            head = head.next;
            System.out.println("Mahasiswa dengan NIM " + nim + " dihapus dari daftar Mahasiswa.");
            return;
        }
        Node prev = head;
        Node cur = head.next;

        while (cur != null && !cur.data.nim.equals(nim)) {
            prev = cur;
            cur = cur.next;
        }
        if (cur == null) {
            System.out.println("Mahasiswa dengan NIM " + nim  + " tidak di temukan dalam daftar mahasiswa");
        } else {
            prev.next = cur.next;
            System.out.println("Mahasiswa dengan NIM " + nim + " dihapus dari daftar Mahasiswa.");
        }
    }

    public void displayMahasiswa() {
        if (head == null) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }
        Node current = head;
        System.out.println("Daftar Mahasiswa:");
        while (current != null) {
            System.out.println("Nama: " + current.data.nama + ", NIM: " + current.data.nim + ", Prodi: " + current.data.prodi + ", IPK : " + current.data.ipk);
            current = current.next;
        }
    }
    public void searchMahasiswa(String nim) {
        if (head == null) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }
        Node current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                System.out.println("Data Mahasiswa ditemukan: ");
                System.out.println("Nama: " + current.data.nama + ", NIM: " + current.data.nim + ", Prodi: " + current.data.prodi + ", IPK : " + current.data.ipk);
                return;
            }
            current = current.next;
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }
}

public class dataMhs {
    public static void main(String[] args) {
        LinkedListMahasiswa list = new LinkedListMahasiswa();
        
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
