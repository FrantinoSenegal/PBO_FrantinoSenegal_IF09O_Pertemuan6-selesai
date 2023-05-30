package Pertemuan6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Masukkan angka : ");
            int angka1 = input.nextInt();

            System.out.print("Masukkan angka pembagi : ");
            int angka2 = input.nextInt();

            int hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil +" (Dibulatkan)");
        }
//        catch (ArithmeticException | InputMismatchException e){
//            System.out.println("Error : " + e);
//        }
        catch (ArithmeticException e){
            System.out.println("error : Kesalahan dalam prthitungan!");
        }
        finally {
            System.out.println(
                    "finally akan selalu dijalankan"
            );
        }
        System.out.println("Akhir dari program");
    }
}
