import java.util.Scanner;
class Login{
    private String nim, getNim;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
        
    }
      public void login(){ 
           String nim, password; 
        System.out.println("==============================================================");
        System.out.println("========Selamat Datang Di Aplikasi perwalian STT Bandung======");
        System.out.println("==============================================================");
        System.out.println("Login:");
        System.out.println("Nim:");
        Scanner login = new Scanner(System.in);
        nim=login.nextLine();
        System.out.println("password:");
        password=login.nextLine();
          
        if(nim.equals("098765")&& password.equals("perwalian")){
                    Sistem sistem = new Sistem();
                    sistem.trf();
                    Perwalian perwalian = new Perwalian();
                    perwalian.mk();
                    perwalian.Tbh();
            
                }
                    else
                {  
                    System.out.println("Nim dan password salah");
                   login();
                }
      }
}