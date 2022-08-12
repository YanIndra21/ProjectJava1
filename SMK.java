public class SMK extends Sekolah {
    private String nama;
    private String alamat;
    private String jenis;

    public SMK(){
        System.out.println("--Sekolah Menengah Kejuruan--");
    }
    public void nama (String x){
        nama = x;
    }
    public void alamat (String y){
        alamat = y;
    }
    public void jenis (String z){
        jenis = z;
    }

    public String getNama(){
        return nama;
   }

   public String getAlamat(){
        return alamat;
   }
   
   public String getJenis(){
    return jenis;
   }
}
