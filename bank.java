import java.io.*;
public class Bankus {
	public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader input=new BufferedReader (new InputStreamReader (System.in)); {
        int nr, option, saldo, proses , no_rekening, kredit, debet; // Variabel
        saldo=5000000;
        no_rekening=123454321;
        debet=0;
        kredit=0;

	try {
    System.out.println (" BANK US (ULFAH SHELLY) ");
    System.out.println (" ");
    System.out.println ("INPUTKAN NO REKENING NASABAH");
    System.out.print ("-> ");
    nr=Integer.parseInt(input.readLine()); // Inputan

		if (nr == 123454321) // Kondisi If
		{

			do { // Kondisi Do While
			System.out.println ("MENU ");
			System.out.println ("A/n AZHAR MUBINA");
			System.out.println ("SILAHKAN PILIH OPTION");

			System.out.println ("-> 1. SALDO");
			System.out.println ("-> 2. TRANSFER");
			System.out.println ("-> 3. PENARIKAN");
			System.out.println ("-> 4. HISTORY TRANSAKSI");
			System.out.println ("-> 5. KELUAR");


			System.out.print ("PILIHAN -> ");
			option=Integer.parseInt(input.readLine());

			switch (option) {

			case 1:
			System.out.println (“================================”);
			System.out.println (“SALDO ANDA SAAT INI : “+saldo);
			System.out.println (“================================”);
			break;

			case 2:
			System.out.println (“=================================”);
			System.out.println (“TRANSFER DANA KE BANK LAIN “);
			System.out.println (“=================================”);

			System.out.print( “Masukan No Rekening : ” );
			no_rekening=Integer.parseInt(input.readLine());
			System.out.print( “Masukan Jumlah Transfer : ” );
			jum_transfer=Integer.parseInt(input.readLine());

			for ( int i=0; i PIN MATCH : OK “);
			}
			else {
			System.out.println (“> PIN NOT MATCH. Trasaksi Batal”);
			}

			if (jum_transfer SALDO : OK”);
			}

			else {
			System.out.print (“–> SALDO TIDAK CUKUP UNTUK TRANSFER. Trasaksi Batal”);
			}

			if (no_rekening == 63240023) { // Cek kevalidan No rekening
			System.out.println (” -> No Rekening = “+no_rekening);
			System.out.println (” -> a/n = Darjo Pamugi”);
			System.out.println (” -> Jumlah Transfer = “+jum_transfer);
			System.out.println (” TRANSAKSI BERHASIL !”); }

			else {
			System.out.println (“No Rekening tidak terdaftar. Transaksi BATAL”);
			}

			saldo=saldo-jum_transfer ;
			break;

			case 3:
			System.out.println (“=================================”);
			System.out.println (“PENARIKAN UANG “);
			System.out.println (“=================================”);
			System.out.print (“Masukan jumlah uang >> “);
			penarikan=Integer.parseInt(input.readLine());
			System.out.println (“Saldo Awal : “+saldo);
			System.out.println (“Penarikan : “+penarikan);
			saldo=saldo-penarikan;
			System.out.println (“Saldo akhir : “+saldo);
			for ( int i=0; i PIN MATCH “);
			}
			else {
			System.out.println (“-> PIN NOT MATCH. Trasaksi Batal”);
			}

			if (penarikan >= (saldo-50000))
			{
			System.out.println (“-> SALDO TIDAK CUKUP : TRANSAKSI GAGAL !”);
			}

			else{
			System.out.println (“TRANSAKSI BERHASIL”);
			}

			break;

			case 4:
			System.out.println (“=================================”);
			System.out.println (“HISTORY TRANSAKSI”);
			System.out.println (“=================================”);
			System.out.println (“Transksi Terakhir”);
			System.out.println (“Penarikan Uang :”+ penarikan);
			System.out.println (“Trasfer Uang :”+ jum_transfer);
			System.out.println (“Saldo Akhir :”+ saldo);
			break;

			default:
			System.out.println (“TERIMA KASIH TELAH MENGGUNAKAN BANK ABC”);

			}
			System.out.println (“\nTEKAN 0 UNTUK KEMBALI KE MENU”);
			System.out.print (“->> “);
			proses=Integer.parseInt(input.readLine());
			++proses;

			}

			while ( proses <= 1);
			}

			else {
			System.out.println ("PIN ANDA SALAH ! ATM ANDA DIBLOKIR. \nHUBUNGI KANTOR CABANG TERDEKAT atau CALL 085642760001");
			}

			}

			catch (IOException e)
			{
			System.out.print("");
			}

			catch (NumberFormatException e)
			{
			System.out.println("PIN BUKAN ANGKA !");
			}
		}
	}
}
