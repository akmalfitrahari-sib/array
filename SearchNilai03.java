import java.util.Scanner;
public class SearchNilai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Masukkan banyak nilai yang ingin diinput :" );
        int n = sc.nextInt();
        int[] arrNilai = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
                arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();

        int hasil = 0;

        for(int i = 0; i < arrNilai.length; i++){
            if(arrNilai[i] == key){
                hasil = i;
                break;
            }
        }

        if (hasil == 0) {
            System.out.println("Nilai yang dicari tidak ditemukan");
        } else {
            System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+(hasil+1));
        }
    }
}
