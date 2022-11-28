public class Bunga {
   public void warnaBunga(){
       System.out.println("Warna Bunga");
   }
}
class Mawar extends Bunga {
    public void warnaBunga(){
        System.out.println("Mawar warna : Merah");
    }
}

class Melati extends Bunga {
    public void warnaBunga(){
        System.out.println("Melati warna : Putih");
    }
}

class Main{
    public static void main(String[] args) {
       Bunga e1=new Bunga();
       Bunga e2=new Mawar();
       Bunga e3=new Melati();
       e1.warnaBunga();
       e2.warnaBunga();
       e3.warnaBunga();


    }
}
