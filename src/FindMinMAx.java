import java.util.Scanner;

public class FindMinMAx {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
    


    //input tiga bilangan
System.out.print("Masukkan Bilangan Pertama (a): ");
    int a = input.nextInt();
System.out.print("Masukkan Bilangan Kedua (b): ");
    int b = input.nextInt();
System.out.print("Masukkan Bilangan Ketiga (c): ");
    int c = input.nextInt();

    // Inisialisasi nilai minimum dan maksimum
int min = a;
int max = a;

    // Proses menentukan nilai minimum
if (b < min) {
    min = b;
}
if (c < min) {
    min = c;
}

    // Proses menentukan nilai maksimum
if (b > max) {
    max = b;
}
if (c > max) {
    max = c;
}

    // Output nilai MinMax
System.out.println("Nilai Minimum adalah: " + min);
System.out.println("Nilai Maximum adlah: " + max);
    }
}