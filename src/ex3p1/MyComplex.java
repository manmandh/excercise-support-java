package ex3p1;
public class MyComplex {
    private double real =0.0;
    private double imag =0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue (double real, double imag) {
        this.real=real;
        this.imag= imag;
    }

    @Override
    public String toString() {
        return real+"+"+imag+"i";
    }

    public boolean isReal() {
        return (imag==0);
    }

    public boolean isImaginary() {
        return (real==0);
    }

    public boolean equals (double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals (  MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(real*real +imag*imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex right) {
        return new MyComplex (real + right.getReal(), imag + right.getImag());
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex (real + right.getReal(), imag + right.getImag());
    }

    public MyComplex subtract(MyComplex right) {
        return new MyComplex (real - right.getReal(), imag - right.getImag());
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex (real - right.getReal(), imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right) {
        real = real*right.getReal()- imag*right.getImag();
        imag = real*right.getImag()+imag*right.getReal();
        return this;
    }

    public MyComplex divide(MyComplex right) {
        MyComplex temp = multiply(right.conjugate());
        double mau = right.real*right.real+ right.imag*right.imag;
        if (mau!=0) {
            real = temp.getReal()/mau;
            imag = temp.getImag()/mau;
        }
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex (real, -imag);
    }
}
