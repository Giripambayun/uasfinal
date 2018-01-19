import java.util.Scanner;
class Add { 
    public String a,tanya, ai,blm,add;
    public int ip,dosen;
    public void Cek(){
            Scanner scannn = new Scanner(System.in);
        System.out.println("apakah anda punya mata kuliah yang belum lulus?(ya/tidak):"); 
            tanya=scannn.nextLine();
                if(tanya.equals("ya")){
                    System.out.println("Masukan matakuliah yang belum lulus:");
                    Scanner scann = new Scanner(System.in);
                    blm=scann.nextLine();
                    System.out.println("==============Dosen Pengampu===============");
                    System.out.println("1.Susi Pujiastuti.ST");
                    System.out.println("2.Ignasius Jonan.ST");
                    System.out.println("Pilih Dosen:");
                    dosen=scann.nextInt();        
                    switch(dosen)
                    {
                        case 1:
                            ai="Susi Pujiastuti.ST";
                        break;
                        case 2:
                             ai="Ignasius Jonan.ST";
                        break;
                    }
                }
                else if(tanya.equals("tidak")){

                }
        }
}