package suma;

public class Suma {
    private int a;
    private int b;

    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Suma() {
    }
    
    
    public int sumatotal(){
        return this.a+this.b;
    }

    public int restatotal(){
        return this.a-this.b;
    }
    
}
