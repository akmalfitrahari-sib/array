import java.util.Scanner;
public class MengelolaNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rata2;
        double total = 0;
        
        System.out.print("Masukkan banyak nilai yang ingin diinput :" );
        int n = sc.nextInt();
        int[] nilaiMhs = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
                nilaiMhs[i] = sc.nextInt();
        }
        for(int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }

        rata2 = total/n;
        int max = nilaiMhs[0];
        int min = nilaiMhs[0];

        for(int i = 0; i < n; i++){
            total += nilaiMhs[i];
            if (nilaiMhs[i] > max){
                max = nilaiMhs[i];
            } if (nilaiMhs[i] < min){
                min = nilaiMhs[i];
            }
        }
        System.out.println();
        System.out.println("----- Data Nilai Mahasiswa -----");
        for(int i = 0; i < n; i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : " + nilaiMhs[i]);
        }
        System.out.println();
        System.out.println("Nilai tertinggi mahasiswa : " + max);
        System.out.println("Nilai terendah mahasiswa : " + min);
        System.out.println("Rata - rata nilai mahasiswa : " + rata2);
    }
}
