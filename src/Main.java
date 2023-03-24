import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // membuat objek LinkedList
        LinkedList list = new LinkedList();

        // menambahkan node ke linked list
//        System.out.print("Masukkan jumlah node: ");
//        int n = input.nextInt();
//
//        System.out.println("Masukkan nilai node:");
//        for (int i = 0; i < n; i++) {
//            int value = input.nextInt();
//            list.add(value);
//        }
        list.add(9);
        list.add(8);

        // mencetak linked list
        System.out.print("Linked list sebelum ditambahkan: ");
        list.printList();

        // menambahkan node baru ke linked list
        System.out.print("Masukkan nilai node baru: ");
        int newValue = input.nextInt();
        list.add(newValue);

        // mencetak linked list setelah ditambahkan
        System.out.print("Linked list setelah ditambahkan: ");
        list.printList();
    }
}
