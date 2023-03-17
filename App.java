import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);

       System.out.print("Jumlah siswa : ");
       int a = input.nextInt();

       String status[] = new String[a];
       Integer nilai[] = new Integer[a];

       for(Integer i = 0; i < a; i++){
        System.out.print("Nilai : ");
        nilai[i] = input.nextInt();

        if(nilai[i]<= 50){
            status[i] = "T Lls";
        } else {
            status[i]= "Lulus";
        }
       }
       System.out.println("Daftar Nilai Siswa");
       System.out.println("===============");
       

       for (Integer i = 8; i< a; i++){
        System.out.println("Hasil : " +nilai[i] + " Statusnya Adlah" + status[i]);
       }
    }
}
