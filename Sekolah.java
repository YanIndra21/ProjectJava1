import java.util.Scanner;
public class Sekolah {
    public void nama(){
        Scanner Nama = new Scanner(System.in);
        System.out.print("Nama Sekolah: ");
        String name = Nama.nextLine();
    }
    public void alamat(){
        Scanner Alamat = new Scanner(System.in);
        System.out.print("Alamat Sekolah: ");
        String addres = Alamat.nextLine();
    }
    public void jenis(){
        Scanner Jenis = new Scanner(System.in);
        System.out.print("Jenis sekolah (Negeri/Swasta): ");
        String type = Jenis.nextLine();
    }
    public void nilaiAkhir(){
        Scanner NilaiAkhir = new Scanner(System.in);
        System.out.print("Nilai Akhir Kelulusan: ");
        float nilaiFinal = NilaiAkhir.nextFloat();
    }
}