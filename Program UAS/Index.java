import java.util.Scanner;
public class Index {
	public static void main(String[] args) {
              int pil;
		Scanner scan = new Scanner(System.in);
        System.out.println("==============================================================");
        System.out.println("=========Selamat Datang Di Aplikasi Akademik STT Bandung======");
        System.out.println("==============================================================");
        System.out.println("pilih Aplikasi:");
        System.out.println("1. Pendaftaran Mahasiswa Baru (PMB)");
        System.out.println("2. Perwalian");        
		pil=scan.nextInt();
        switch(pil)
        {
            case 1:
                Sistem sistem = new Sistem();
                sistem.Verif();
            break;
            case 2:
                Login login = new Login();
                login.login();  
            break;
        }
	}
}