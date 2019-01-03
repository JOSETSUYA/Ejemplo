/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexset;

/**
 *
 * @author IES TRASSIERRA
 */
public class Complexset {
private int parReal;
private int parImg;

    public Complexset(int parReal, int parImg) {
        this.parReal = parReal;
        this.parImg = parImg;
    }
public Complexset() {
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
    public static Complexset sum(Complexset c1, Complexset c2){
        Complexset result;
        result = new Complexset(c1.getParReal()+c2.getParReal(),c1.getParImg()+c2.getParImg());
        return result;
    }
    public Complexset sum(Complexset c){
        Complexset result;
        result = new Complexset(c.getParReal()+c.getParReal(),c.getParImg()+c.getParImg());
        return result;
    }
    @Override
    public String toString() {
        return "{"+parReal+","+parImg +"}";
    }

}
