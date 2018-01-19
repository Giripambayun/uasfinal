import java.util.Scanner;
class Perwalian { 
    public String a, tanya,ab,blm,add, ai, oop ,ooad, imk, kompilasi, graph, web2;
    public double ip;
    public int guru,ai1, oop1, ooad1, imk1, kompilasi1, graph1, web21;
    public void setAi(String ai) {
        this.ai = ai;
    }

    public void setOop(String oop) {
        this.oop = oop;
    }

    public void setOoad(String ooad) {
        this.ooad = ooad;
    }
     public void setImk(String imk) {
        this.imk = imk;
    }

    public void setKompilasi(String kompilasi) {
        this.kompilasi = kompilasi;
    }

    public void setGraph(String graph) {
        this.graph = graph;
    }
    public void setWeb2(String web2) {
        this.web2 = web2;
    }
//getter
    public String getAi() {
        return ai;   
    }

    public String getOop() {
        return oop;
    }

    public String getWeb2() {
        return web2;
    }
    public String getGraph() {
        return graph;   
    }

    public String getKompilasi() {
        return kompilasi;
    }

    public String getImk() {
        return imk;
    }
    public String getOoad() {
        return ooad;
    }
    public void Ai(){
        System.out.println("==============Dosen Pengampu Intelegensi Buatan===============");
        System.out.println("1.Susi Pujiastuti.ST");
        System.out.println("2.Ignasius Jonan.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        ai1=scan.nextInt();        
        switch(ai1)
        {
            case 1:
                ai="Susi Pujiastuti.ST";
            break;
            case 2:
                ai="Ignasius Jonan.ST";
            break;
        }
    } 
    public void Oop(){
        System.out.println("==============Dosen Pengampu OOP===============");
        System.out.println("1.Yuliana.ST");
        System.out.println("2.Usep Gunawan.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        oop1=scan.nextInt();
        switch(oop1)
        {
            case 1:
                oop="Yuliana.ST";
            break;
            case 2:
                 oop="Usep Gunawan.ST";
            break;
        }
    }
     public void Ooad(){
        System.out.println("==============Dosen Pengampu OOAD===============");
        System.out.println("1.Alan Nurjaelani.ST");
        System.out.println("2.Sandi Kurnia.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        ooad1=scan.nextInt();
          switch(ooad1)
        {
            case 1:
                ooad="Alan Nurjaelani.ST";
            break;
            case 2:
                 ooad="Sandi Kurnia.ST";
            break;
        }
    }
     public void Web2(){
       System.out.println("==============Dosen Pengampu web 2===============");
        System.out.println("1.Komarudin.ST");
        System.out.println("2.Sri Wahyuni.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        web21=scan.nextInt();
        switch(web21)
        {
            case 1:
                web2="Komarudin.ST";
            break;
            case 2:
                 web2="Sri Wahyuni.ST";
            break;
        }
    }
     public void Graph(){
        System.out.println("==============Dosen Pengampu Teori Graph===============");
        System.out.println("1.Bilal.ST");
        System.out.println("2.Ali Nusaepudin.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        graph1=scan.nextInt();
        switch(graph1)
        {
            case 1:
                graph="Bilal.ST";
            break;
            case 2:
                graph="Ali Nusaepudin.ST";
            break;
        }
    }
     public void Imk(){
        System.out.println("==============Dosen Pengampu Interaksi Manusia dan Komputer===============");
        System.out.println("1.Andri Hermawan.ST");
        System.out.println("2.Yudi Sudrajat.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        imk1=scan.nextInt();
        switch(imk1)
        {
            case 1:
                imk="Andri Hermawan.ST";
            break;
            case 2:
                imk="Yudi Sudrajat.ST";
            break;
        }
     }
     public void Kompilasi(){
        System.out.println("==============Dosen Pengampu Teknik Kompilasi===============");
        System.out.println("1.Senie Setyawati.ST");
        System.out.println("2.Tira.ST");
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih Dosen:");
        kompilasi1=scan.nextInt();
        switch(kompilasi1)
        {
            case 1:
                kompilasi="Senie Setyawati.ST";
            break;
            case 2:
                kompilasi="Tira.ST";
            break;
        }
     }
    public void mk(){
        System.out.println("==============================================================");
        System.out.println("=======perwalian Teknik informatika 15A semester lima (5)=====");
        System.out.println("==============================================================");
        System.out.println("mata kuliah yang akan di hadapi:");
        System.out.println("1.Intelegensi buatan");
        System.out.println("2.OOP1");
        System.out.println("3.OOAD");
        System.out.println("4.Web 2");
        System.out.println("5.Teori Graph");
        System.out.println("6.Teknik Kompilasi");
        System.out.println("7.Interaksi Manusia dan Komputer");        
        Oop();
        Ai();
        Ooad();
        Web2();
        Graph();
        Kompilasi();
        Imk();
    }
    public void Tbh(){
        //Dosen dosen = new Dosen();
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Ip semester sebelumya:");
        ip=scan.nextDouble();
        if(ip<3.0){
            System.out.println("Maaf anda tidak diperbolehkan menambah mata kuliah lagi di semester ini");
            System.out.println("Anda hanya di perbolehkan mengambil mata kuliah yang belum tuntas saja");
            System.out.println("apakah anda akan mengambil mata kuliah yang belum lulus?(fisika 2):");   
            //Scanner scan = new Scanner(System.in);
            tanya=scan.next();
                if(tanya.equals("ya")){
                    //System.out.println("Masukan matakuliah yang belum lulus:");
                    Scanner scann = new Scanner(System.in);
                    blm=scan.nextLine();
                    System.out.println("==============Dosen Pengampu===============");
                    System.out.println("1.Susi Pujiastuti.ST");
                    System.out.println("2.Ignasius Jonan.ST");
                    System.out.println("Pilih Dosen:");
                    guru=scan.nextInt();        
                    switch(guru)
                    {
                        case 1:
                            ab="Susi Pujiastuti.ST";
                        break;
                        case 2:
                             ab="Ignasius Jonan.ST";
                        break;
                    }
                    
                    System.out.println("=========================================================================");
                    System.out.println("=======perwalian selesai berikut nama dosen& matakuliah yang dipilih=====");
                    System.out.println("=========================================================================");
                    System.out.println("Dosen Fisika 2:"+ab);
                    System.out.println("Dosen Intelegensi Buatan:"+getAi());
                    System.out.println("Dosen OOP 1:"+getOop());
                    System.out.println("Dosen OOAD:"+getOoad());
                    System.out.println("Dosen Web 2:"+getWeb2());
                    System.out.println("Dosen Teori Graph:"+getGraph());
                    System.out.println("Dosen Teknik Kompilasi:"+getKompilasi());
                    System.out.println("Dosen Interaksi Manusia dan Komputer:"+getImk());
                }
                else if(tanya.equals("tidak")){
                    System.out.println("=========================================================================");
                    System.out.println("=======perwalian selesai berikut nama dosen& matakuliah yang dipilih=====");
                    System.out.println("=========================================================================");
                    System.out.println("Dosen Intelegensi Buatan:"+getAi());
                    System.out.println("Dosen OOP 1:"+getOop());
                    System.out.println("Dosen OOAD:"+getOoad());
                    System.out.println("Dosen Web 2:"+getWeb2());
                    System.out.println("Dosen Teori Graph:"+getGraph());
                    System.out.println("Dosen Teknik Kompilasi:"+getKompilasi());
                    System.out.println("Dosen Interaksi Manusia dan Komputer:"+getImk());
                }
        }
            else{
                //Scanner scannn = new Scanner(System.in);
                System.out.println("apakah anda ingin matakuliah tambahan?:");
                add=scan.nextLine();
                if(add.equals("ya")){
                    System.out.println("mata kuliah tambahan yang kami pilih OOP 2");
                    System.out.println("==============Dosen Pengampu===============");
                    System.out.println("1.Susi Pujiastuti.ST");
                    System.out.println("2.Ignasius Jonan.ST");
                    System.out.println("Pilih Dosen:");
                    guru=scan.nextInt();        
                    switch(guru)
                    {
                        case 1:
                            ab="Susi Pujiastuti.ST";
                        break;
                        case 2:
                             ab="Ignasius Jonan.ST";
                        break;
                    }
                     System.out.println("=========================================================================");
                    System.out.println("=======perwalian selesai berikut nama dosen& matakuliah yang dipilih=====");
                    System.out.println("=========================================================================");
                    System.out.println("Dosen OOP2 2:"+ab);
                    System.out.println("Dosen Intelegensi Buatan:"+getAi());
                    System.out.println("Dosen OOP 1:"+getOop());
                    System.out.println("Dosen OOAD:"+getOoad());
                    System.out.println("Dosen Web 2:"+getWeb2());
                    System.out.println("Dosen Teori Graph:"+getGraph());
                    System.out.println("Dosen Teknik Kompilasi:"+getKompilasi());
                    System.out.println("Dosen Interaksi Manusia dan Komputer:"+getImk());
                }
                else if(add.equals("tidak")){ 
                    System.out.println("=========================================================================");
                    System.out.println("=======perwalian selesai berikut nama dosen& matakuliah yang dipilih=====");
                    System.out.println("=========================================================================");
                    System.out.println("Dosen Intelegensi Buatan:"+getAi());
                    System.out.println("Dosen OOP 1:"+getOop());
                    System.out.println("Dosen OOAD:"+getOoad());
                    System.out.println("Dosen Web 2:"+getWeb2());
                    System.out.println("Dosen Teori Graph:"+getGraph());
                    System.out.println("Dosen Teknik Kompilasi:"+getKompilasi());
                    System.out.println("Dosen Interaksi Manusia dan Komputer:"+getImk());
                }
            }
    }
}