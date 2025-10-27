public class membandingkan {
public static void main(String[] args) {
        System.out.println("=== UJI PENAMBAHAN DATA ===");

        long startAddArray = System.nanoTime();
        ArrayListMahasiswa arrayList = new ArrayListMahasiswa();
        arrayList.addMahasiswa("Rizky", "111", "Teknik Informatika", 3.36f);
        arrayList.addMahasiswa("Lindo", "112", "Teknik Informatika", 3.35f);
        arrayList.addMahasiswa("Rafa", "113", "Teknik Informatika", 3.40f);
        arrayList.addMahasiswa("Ihsan", "114", "Teknik Informatika", 3.35f);
        long endAddArray = System.nanoTime();

        long startAddLinked = System.nanoTime();
        LinkedListMahasiswa linkedList = new LinkedListMahasiswa();
        linkedList.addMahasiswa("Rizky", "111", "Teknik Informatika", 3.36f);
        linkedList.addMahasiswa("Lindo", "112", "Teknik Informatika", 3.35f);
        linkedList.addMahasiswa("Rafa", "113", "Teknik Informatika", 3.40f);
        linkedList.addMahasiswa("Ihsan", "114", "Teknik Informatika", 3.35f);
        long endAddLinked = System.nanoTime();

        System.out.println("ArrayList add time  : " + (endAddArray - startAddArray) + " ns");
        System.out.println("LinkedList add time : " + (endAddLinked - startAddLinked) + " ns\n");


        System.out.println("=== UJI PENCARIAN DATA ===");

        long startSearchArray = System.nanoTime();
        arrayList.searchMahasiswa("113");
        long endSearchArray = System.nanoTime();

        long startSearchLinked = System.nanoTime();
        linkedList.searchMahasiswa("113");
        long endSearchLinked = System.nanoTime();

        System.out.println("ArrayList search time  : " + (endSearchArray - startSearchArray) + " ns");
        System.out.println("LinkedList search time : " + (endSearchLinked - startSearchLinked) + " ns\n");


        System.out.println("=== UJI PENGHAPUSAN DATA ===");

        long startRemoveArray = System.nanoTime();
        arrayList.removeMahasiswa("111");
        long endRemoveArray = System.nanoTime();

        long startRemoveLinked = System.nanoTime();
        linkedList.removeMahasiswa("111");
        long endRemoveLinked = System.nanoTime();

        System.out.println("ArrayList remove time  : " + (endRemoveArray - startRemoveArray) + " ns");
        System.out.println("LinkedList remove time : " + (endRemoveLinked - startRemoveLinked) + " ns\n");
    }
}