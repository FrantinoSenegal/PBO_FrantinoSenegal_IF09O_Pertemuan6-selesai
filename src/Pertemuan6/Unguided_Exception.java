package Pertemuan6;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Unguided_Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama : FRANTINO SENEGAL ");
        System.out.println();
        System.out.print("Nim  : 21102225 ");
        System.out.println();
        System.out.println();

        try{
            System.out.print("Masukan bilangan pertama : ");
            int bilangan1 = input.nextInt();

            System.out.print("Masukan bilangan kedua   : ");
            int bilangan2 = input.nextInt();

            if (bilangan2 != 0 ) {
                int hasil = jumlahBilangan(bilangan1, bilangan2);
                System.out.println("Hasil penjumlahan : " + hasil);
            }else {
                System.out.println("Error : Pembagian dengan nol tidak diizinkan!");
            }
        }
        catch (InputMismatchException e){
            System.out.println("Error : Input tidak valid. Masukan bilangan bulat!");
        }
    }
    public static int jumlahBilangan(int bilangan1, int bilangan2){
        return bilangan1 + bilangan2;
    }
}

