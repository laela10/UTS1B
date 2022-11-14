import java.util.Random;
import java.util.Scanner;

public class JawabanUTS {

    int jumMabaPoltek = 3; // TI,DKV,TeknikKom
    static int totalJumlahPenerimaanMabaPoltek = 1050; //diubah sesuai soal
    public static String[] TI = new String[500];
    public static String[] DKV = new String[300];
    public static String[] TeknikKom = new String[250];

    public static void PrintInfoPenerimaanMabaPoltek(){
        int totalTI=0;
        int totalSisaKursi = 0;
        for(int index=0;index<TI.length;index++){
            if(TI[index] != null){
                totalTI++;
            }
        }
        int totalDKV=0;
        for(int index=0;index<DKV.length;index++){
            if (DKV[index] != null){
                totalDKV++;
            }
        }
        int totalTeknikKom=0;
        for(int index=0;index<TeknikKom.length;index++){
            if (TeknikKom[index] != null){
                totalTeknikKom++;
            }
        }
        totalSisaKursi = totalJumlahPenerimaanMabaPoltek - totalTI - totalDKV - totalTeknikKom;
        System.out.println("Total PenerimaanMabaPoltek TI; " + totalTI + " | Total PenerimaanMabaPoltek DKV: " + totalDKV +"| Total PenerimaanMabaPoltek TeknikKom: " + totalTeknikKom);
        System.out.println("Jumlah Seluruh MabaPoltek : "+ totalJumlahPenerimaanMabaPoltek + " | Total Sisa Kursi: " + totalSisaKursi);
        System.out.println();
    }
    public static void CheckIndexArray(String[] myArray,String PenerimaanMabaPoltek){
        int indexNow = 0;
        for (int index = 0; index < myArray.length; index++){
            if (myArray[index] != null){
                indexNow = index+1;
            }
        }
        if(indexNow < myArray.length){
            myArray[indexNow] = PenerimaanMabaPoltek;
        }
    }
    public static void simpanPenerimaanMabaPoltek(int angkaRandom, String PenerimaanMabaPoltek){
        switch (angkaRandom) {
            case 1:
                CheckIndexArray(TI, PenerimaanMabaPoltek);
                System.out.println("Anda mendapatkan NIK + TI22" + angkaRandom);
                PrintInfoPenerimaanMabaPoltek();
                break;
            case 2:
                CheckIndexArray(DKV, PenerimaanMabaPoltek);
                System.out.println("Anda mendapatkan NIK + DK22" + angkaRandom);
                PrintInfoPenerimaanMabaPoltek();
                break;
            case 3:
                CheckIndexArray(TeknikKom, PenerimaanMabaPoltek);
                System.out.println("Anda mendapatkan NIK + TK22" +angkaRandom);
                PrintInfoPenerimaanMabaPoltek();
                break;
        }
    }
    public static void inputPenerimaanMabaPoltek() {
        Scanner inputData = new Scanner(System.in);
        while(true){
            System.out.println("Nama dan Prodi MabaPoltekHarber =");
            String namaPenerimaanMabaPoltek = inputData.nextLine();
            if (namaPenerimaanMabaPoltek.isBlank()) {
                System.out.println("Nama dan Prodi MabaPoltekHarber wajib diisi");
                inputPenerimaanMabaPoltek();
            }else{
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3) + 1;
                simpanPenerimaanMabaPoltek(JenisRandom, namaPenerimaanMabaPoltek);
            }
        }
    }
    public static void main(String[] args){
        inputPenerimaanMabaPoltek();
        //
    }
}