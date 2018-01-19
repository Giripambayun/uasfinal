import java.util.Scanner;
class Input {
    private String nama,umur,alamat;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
        
    }

    public String getUmur() {
        return umur;
    }

    public String getAlamat() {
        return alamat;
    }
	public void Biodata() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nama lengkap:");
		nama= scan.nextLine();

		System.out.print("umur:");
		umur = scan.nextLine();
		System.out.print("Alamat Lengkap:");
		alamat = scan.nextLine();
    }
    public void callnim(){
        System.out.println("Nim anda :098765"); 
    }
}