
/* PRODUCTO -> (ac-bd) + (ad+bc)i

*/

package complexset;

public class Complex {

    private int parReal;
    private int parImg;

    public Complex(int parReal, int parImg) {
        this.parReal = parReal;
        this.parImg = parImg;
    }

    public Complex() {
        this.parReal = 1;
        this.parImg = 1;
    }

    public int getParReal() {
        return parReal;
    }

    public int getParImg() {
        return parImg;
    }

    public void setParReal(int parReal) {
        this.parReal = parReal;
    }

    public void setParImg(int parImg) {
        this.parImg = parImg;
    }

    public static Complex sum(Complex c1, Complex c2) {
        Complex result;
        result = new Complex(c1.getParReal() + c2.getParReal(), c1.getParImg() + c2.getParImg());
        return result;
    }

    public Complex sum(Complex c) {
        Complex result;
        result = new Complex(parReal + c.getParReal(), this.getParImg() + c.getParImg());
        return result;
    }
    public static Complex subs(Complex c1, Complex c2) {
        Complex result;
        result = new Complex(c1.getParReal() - c2.getParReal(), c1.getParImg() - c2.getParImg());
        return result;
    }

    public Complex subs(Complex c) {
        Complex result;
        result = new Complex(parReal- c.getParReal(), parImg - c.getParImg());
        return result;
    }
    public static Complex multi(Complex c1, Complex c2) {
        Complex result;
        int r, i;
        r = c1.parReal*c2.parReal-c1.parImg*c2.parImg;
        i= c1.parReal*c2.parImg+c1.parImg*c2.parReal;
        result = new Complex(r,i);
        return result;
    }

    public Complex multi(Complex c) {
        int r, i;
        r = parReal*c.parReal-parImg*c.parImg;
        i= parReal*c.parImg+parImg*c.parReal;
        return new Complex(r,i);
    }


    @Override
    public String toString() {
        return "{" + parReal + "," + parImg + "}";
    }
}
