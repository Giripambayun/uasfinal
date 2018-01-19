import java.util.Scanner;
class Test extends Input{
      public void bagus(){
        String bg, wb;
        Input input = new Input();
        input.Biodata();
        System.out.print("siapakah pendiri microsoft?");
        Scanner test1 = new Scanner(System.in);
        bg=test1.nextLine();
            if(bg.equals("bill gates")){
                System.out.println("Selamat Anda Lulus Test dan mendapat NIM");
                System.out.println("Nama:"+input.getNama());
                input.callnim();
            }
            else{
                System.out.println("Maaf Anda Gagal Dalam ujian dan anda mendapat kesempatan 1 kali lagi ujian");
                System.out.println("Apa nama sistem operasi buatan microsoft?");
                Scanner test2 = new Scanner(System.in);
                wb=test2.nextLine();
                     if(wb.equals("windows")){
                        System.out.println("Selamat Anda Lulus Test dan mendapat NIM");
                        System.out.println("Nama:"+input.getNama());
                        input.callnim();
                     }  
                else{
                    System.out.println("Maaf anda gagal ujian Masuk STT Bandung");
                }
            }
      }
}