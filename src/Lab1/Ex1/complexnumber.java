package Lab1.Ex1;

public class complexnumber {
    int real;
    int imag;

    public void setReal(int real) {
        this.real = real;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    public int getReal() {
        return real;
    }

    public int getImag() {
        return imag;
    }

    complexnumber (){
       this.real=0;
       this.imag=0;
   }
   complexnumber(int a,int b){
       this.real=a;
       this.imag=b;
   }
}
