import java.util.Scanner;

public class Faktorial {

    // fungsi rekursif: n! = n x (n-1)!
    public static long faktorial(int n) {
        if (n == 0 || n == 1) {      // base case: 0! = 1 dan 1! = 1
            return 1;
        }
        return n * faktorial(n - 1); // fungsi memanggil dirinya sendiri
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Faktorial bilangan negatif tidak terdefinisi.");
        } else if (n > 20) {
            System.out.println("Bilangan maksimal 20, karena 21! melebihi batas tipe long.");
        } else {
            System.out.println(n + "! = " + faktorial(n));
        }

        input.close();
    }
}