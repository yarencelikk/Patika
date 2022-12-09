public class FizikProje {
    public  static  void main(String [] args){
        String F = ("x------------------x------------------x");
        System.out.println(F);
        System.out.println();

        /*
        A=4,B=6,C=3 m büyüklüğünde vektörlerdir.Vektörlerin yatay eksenle yaptıkları açılar ise QA=75,QB=30,QC=50 dir.
        A,B,C vektörlerinin toplamının  büyüklüğünü veyatay eksenle yaptığı açıyı hesaplayınız.
         */

        double A= 180-75;
        double Ax =(Math.cos(Math.toRadians(A)) * 4);
        System.out.println("Ax =" + Ax);
        double Ay =(Math.sin(Math.toRadians(A)) * 4);
        System.out.println("Ay =" + Ay);
        double B = 30;
        double Bx =(Math.cos(Math.toRadians(B)) * 6);
        System.out.println("Bx =" + Bx);
        double By =(Math.sin(Math.toRadians(B)) * 6);
        System.out.println("By =" + By);
        double C = 180 + 50 ;
        double Cx =(Math.cos(Math.toRadians(C)) * 3);
        System.out.println("Cx =" + Cx);
        double Cy =(Math.sin(Math.toRadians(C)) * 3);
        System.out.println("Cy =" + Cy);
        double Rx = Ax + Bx + Cx ;
        System.out.println("Rx =" +Rx);
        double Ry = Ay + By + Cy ;
        System.out.println("Ry =" +Ry);
        String R = Rx+"i" + "+" + Ry+"j";
        System.out.println("R =" +R);
        double Rbuyukluk= (Math.sqrt(Rx*Rx + Ry*Ry));
        System.out.println("Rbuyukluk =" + Rbuyukluk);
        double aciR =(Math.toDegrees(Math.atan(Ry/Rx)));
        System.out.println("aciR =" + aciR);

        System.out.println();
       String x = ("x------------------x------------------x");
        System.out.println(x);
        System.out.println();

     /*
     Akıntı hızının sabit ve 4 m/s olduğu nehrde suya göre 10 m/s hızlarla harekete geçen botlar,
     karşı kıyıya ulaştıklarında aralarındaki uzaklık ne kadar olur? Nehirin genişliği 60 m dir.
     */
       double V1x =(10 * Math.cos(Math.toRadians(130)));
        System.out.println("V1x =" + V1x);
       double V1y =(10 * (Math.sin(Math.toRadians(130))));
        System.out.println("V1y =" + V1y);
        double V2x =(10 * (Math.cos(Math.toRadians(30))));
        System.out.println("V2x =" + V2x);
        double V2y =(10 * (Math.sin(Math.toRadians(30))));
        System.out.println("V2y =" + V2y);
        double t1 = 60 / V1y ;
        System.out.println("t1 =" +t1);
        double t2 = 60 / V2y ;
        System.out.println("t2 =" +t2);
        double x1 = (V1x + 4) * t1 ;
        System.out.println("x1 =" +x1);
        double x2 = ( V2x + 4) * t2 ;
        System.out.println("x2 =" +x2);
        double Dx = x2 - x1 ;
        System.out.println("Dx =" +Dx);

        System.out.println();
        String z = ("x------------------x------------------x");
        System.out.println(z);
        System.out.println();
        /*
        Bir futbolcu, toptan 35m uzaklıktaki bir kaleye şut çekmektedir.Şut çekildiği anda top, zemini
        35 derecelik bir açı ve 2o m/s lik bir hızla terk etmiştir.Üst direğin yerden yüksekliği 2.44 m olduğuna
        göre bu vuruş gol olur mu? g= 9.8 m/s*s
         */
        double Vx = ( 20 * (Math.cos(Math.toRadians(35))));
        System.out.println("Vx =" + Vx);
        double Vy = ( 20 * (Math.sin(Math.toRadians(35))));
        System.out.println("Vy =" + Vy);
        String V = Vx + "i" + "+" + Vy + "j";
        System.out.println("V =" + V);
        double Tcikis = Vy / 9.8;
        System.out.println("Tcikis =" +Tcikis);
        double Tucus = 2 * Tcikis;
        System.out.println("Tucus =" +Tucus);
        double Ta = 35/Vx ;
        System.out.println("Ta =" + Ta);
        double y = Vy*Ta-0.5*9.8*Ta*Ta;
        System.out.println("y =" +y);
        if ( y < 2.44){
            System.out.println("GOOOOL!!!!");
        }
        else{
            System.out.println("GOL DEĞİL!");
        }
        System.out.println();
        String Q= ("x------------------x------------------x");
        System.out.println(Q);


    }

}
