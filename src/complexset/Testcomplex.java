
package complexset;

public class Testcomplex {
    public static void main(String[] args){
        Complex c1 = new Complex(3,4);
        System.out.println("");
        Complex c2 = new Complex(1,5);
        System.out.println("");
        System.out.print(c1 +"+"+ c2 +"=" );
        System.out.println(Complex.sum(c1, c2));
        System.out.print(c1 +"-"+ c2 +"=" );
        System.out.println(Complex.subs(c1, c2));
        System.out.print(c1 +"*"+ c2 +"=" );
        System.out.println(Complex.multi(c1, c2));
        System.out.print(c1 +"+"+ c2 +"=" );
        System.out.println(c1.sum(c2));
        System.out.print(c1 +"-"+ c2 +"=" );
        System.out.println(c1.subs(c2));
        System.out.print(c1 +"*"+ c2 +"=" );
        System.out.println(c1.multi(c2));
        int numbers [] = new int [5];
        numbers [0] = 0;
        Complex c3 = new Complex();
        Complex c4 = new Complex(2,3);
        Complex c5 = new Complex(4,5);
        Complex complexes [] = new Complex[5];
        complexes [0] = new Complex (1,1);
        complexes [1] = c1;
        complexes [2] = c2;
        complexes [3] = c3;
        complexes [4] = c4;
        Complex accumulator = new Complex(0,0);
        for (int i = 0; i < complexes.length; i++) {
            //accumulator = Complex.sum(complexes[i],accumulator); // metodo estatico
            accumulator = complexes[i].sum(accumulator); //metodo objeto
            
        }
        System.out.println("Sum = " + accumulator);
    }
}
 //hacer clase racional para casa