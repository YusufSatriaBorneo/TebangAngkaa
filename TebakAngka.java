// mengimpor Scanner ke program
import java.util.Scanner;

// Membuat Class Java
public class TebakAngka{
    public static void main(String [] args){

        // Dekralasi Variabel
        Scanner input =  new Scanner(System.in); // Untuk masukan input keyboard
        int rahasia, tebakan;
        boolean pass = false; // untuk lanjut ke program seterusnya jika salah sama dengan switch karena ada break

        // Mengatur inisialisasi
        rahasia = 1 + (int)(Math.random() * 10);
        System.out.println ("Ayo Main Tebak Angka");
        System.out.println("Tebaklah 3 angka yang ada");
        System.out.println("Masukan Angka Itu di bawah ini :");


        // Logika Mengunakan For pada java
        for(int i=0; i < 3 ; i++){
            tebakan = input.nextInt(); // untuk memasukan angka keyboard sama dengan atas
                if (tebakan == rahasia){
                    System.out.println("Selamat Tebakan Mu benar");
                    System.out.println("Kamu Menang");
                    pass = true;
                    break;
                }else if (Math.abs(tebakan - rahasia) == 1){
                    System.out.println("panas");

                }else if(Math.abs(tebakan - rahasia) == 2){
                    System.out.println("hangat");
                }else{
                    System.out.println("Dingin");
                }
        }
        if (pass == false){ // di gunakan Karena break pada dalam if hanya melakukan pemberhentian perulangan for saja. Sedangkan “You’ve lost your chances!” ini terdapat pada luar for. Jadi akan tetap tereksekusi setelah keluar dari for.
        System.out.println("Maaf Kamu Salah Sudah 3 Kali");
        System.out.println("Mari Coba Lagi");
        System.out.println("Jawaban yang benar adalah : " + rahasia );

        }
        input.close(); // maka dari itu harus di buat kondisi baru untuk berhasil 
    }
}