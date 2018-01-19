import java.util.Scanner;
class Sistem extends Input {
	public void Verif() {
        int no;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nominal uang pendaftaran anda:");
        no=scan.nextInt();
		if(no==200000){/
                 Test test = new Test();
                 test.bagus();
        }
            else{
                System.out.print("maaf nominal yang anda bayar salah uang anda batal dibayarkan");
            }
	}
    public void trf() {
        int no;
        String ulang;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nominal uang perwalian anda:");
        no=scan.nextInt();
		if(no==1000000){
                 
        }
            else{
                Scanner scann = new Scanner(System.in);
                System.out.println("maaf nominal yang anda bayar salah uang anda batal dibayarkan.");
                System.out.println("ulangi lagi?");
                ulang=scann.nextLine();
                if(ulang.equals("ya")){
                trf();
                }
                else{
                    
                }
            }
	}

	
}