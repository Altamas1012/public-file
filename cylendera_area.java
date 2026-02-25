/*
cilander volume =3.14*r*r*h;
surf are=2*3.14*R*l + 2*3.14*r*r;

*/
class cylender{
    int r;
    int h;
    double volume;
    double surfa;


  
    public int getr(){
        return r;
 
    }
    public int seth(){
        return h;

    }
    public double getv(){
        return volume;

    }
     public double getsa(){
        return surfa;

    }

}
public class cylendera_area {

    public static void main(String[] args) {
        cylender s=new cylender();
        s.r=5;
        s.h=7;
        s.volume=3.14*s.r*s.r*s.h;
        s.surfa=(2*3.14*s.r*s.h)+(2*3.14*s.r*s.r);

    //       System.out.println(s.getr());
    //   System.out.println(s.seth());
    //   System.out.println(s.getv());
    //   System.out.println(s.getsa());

    }
}

