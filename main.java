import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SD sd = new SD();
        sd.nama();
        sd.alamat();
        sd.jenis();
        sd.nilaiAkhir();
        SMP smp = new SMP();
        smp.nama();
        smp.alamat();
        smp.jenis();
        smp.nilaiAkhir();
        Scanner SmaSmk = new Scanner(System.in);
        System.out.print("SMA/SMK: ");
        String SMASMK = SmaSmk.nextLine();
        switch (SMASMK) {
            case "SMA":
                SMA sma = new SMA();
                sma.nama();
                sma.alamat();
                sma.jenis();
                sma.nilaiAkhir();
                break;
            case "SMK":
                SMK smk = new SMK();
                smk.nama();
                smk.alamat();
                smk.jenis();
                smk.nilaiAkhir();
                break;
            default:
                break;
        }
    
    }
}
