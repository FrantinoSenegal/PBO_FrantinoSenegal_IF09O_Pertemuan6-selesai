package Pertemuan6;

public class TryCatch {

    //Membuat method main
    public static void main(String[] args) {
        int[] angka = {
                1, 2, 3, 4, 5
        };
        System.out.println("index ke 4 ada : ");
        try {
            //Memanggil array berdasarkan index
            System.out.println(
                    angka[4]
            );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "index yang anda masukkan melebihi batas"
            );
        }
        System.out.println("index ke 6 ngga ada ");
        try {
            //Memanggil array bedasarkan index
            System.out.println(
                    angka[6]
            );
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(
                    "index yang anda masukkan melebihi batas"
            );
        }
    }
}