package Nasabah;
import java.util.Scanner;

public class JumlahSaldo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int setoran_awal,lama_menabung;
        System.out.println("Masukan Setoran Awal : ");
        setoran_awal = input.nextInt();
        System.out.println("Lama Menabung : "+ "  (bulan)");
        lama_menabung = input.nextInt();
        if (lama_menabung>=12){
            System.out.println("saldo akhir :"+setoran_awal*5/100+"");
        }else {
            System.out.println("saldo akhir :"+setoran_awal*3/100+"");
        }

    }
}
