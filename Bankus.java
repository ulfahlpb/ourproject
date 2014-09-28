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
			System.out.println ("-> 2. DEBET");
			System.out.println ("-> 3. KREDIT");
			System.out.println ("-> 4. HISTORY TRANSAKSI");
			System.out.println ("-> 5. KELUAR");


			System.out.print ("PILIHAN -> ");
			option=Integer.parseInt(input.readLine());