package mano.operators;

public class EqualityOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        boolean c = a==b;
        boolean d = a!=b;
        System.out.println("c= "+c);
        System.out.println("d= "+d);

        boolean x=true;
        boolean y=false;
        boolean z=(y=true) && (x=false);
        System.out.println("x= "+x); //false
        System.out.println("y= "+y); //true
        System.out.println("z= "+z); //false
    }
}
