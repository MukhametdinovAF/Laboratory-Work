package Programming.laba1.hometask18;

public class Example18 {
    static double a =10.0, b=4.0, c, y;
    public static double hyp(){
        return c = Math.sqrt(a*a + b*b);
    }
    public static double exp(){return y=Math.getExponent(b*Math.log(a));}
    public static void main(String[] args) {
        System.out.println("katet а=" + a);
        System.out.println("katet b=" + b);
        System.out.println("hypotenuse с=" + hyp());
        System.out.println("Exp=" +exp());
    }
}
