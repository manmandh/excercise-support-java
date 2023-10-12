package ex3p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Polynomial {
    private double[] coeffs;
    public Polynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public Polynomial(String filename) {
        //gets coeffs from file
        Scanner in = null;
        try {
            in = new Scanner(new File(filename));  // open file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int degree = in.nextInt();      // read the degree
        coeffs = new double[degree+1];  // allocate the array
        for (int i=0; i<coeffs.length; ++i) {
            coeffs[i] = in.nextDouble();
        }
    }

    public int getDegree() {
        int endIndex = this.coeffs.length;
        for(int i = this.coeffs.length - 1;i>0;--i) {
            if(this.coeffs[i] == 0) {
                continue;
            } else {
                endIndex = i;
                return endIndex + 1;
            }
        }
        return endIndex;
    }

    public String toString() { // fix problem with strings ending in "+"
        String ret = "";
        for(int i = this.getDegree() - 1;i >= 0;--i) {
            if(this.coeffs[i] != 0) {
                if(this.coeffs[i] == 1) {
                    if(i == 1) {
                        ret += ("x" + " + " );
                    } else if(i == 0) {
                        ret += "1";
                    } else {
                        ret += ("x^" + Integer.toString(i) + " + " );
                    }
                } else {
                    if(i == 1) {
                        ret += (Double.toString(this.coeffs[i]) + "x" + " + " );
                    } else if(i == 0) {
                        ret += (Double.toString(this.coeffs[i]) + " + " );
                    } else {
                        ret += (Double.toString(this.coeffs[i]) + "x^" + Integer.toString(i) + " + " );
                    }
                }
            }
        }
        return ret;
    }

    public double evaluate(double x) {
        double val = 0;
        for(int i = 0;i < this.getDegree();++i) {
            val += (this.coeffs[i] * (Math.pow(x, i)));
        }
        return val;
    }

    public Polynomial add(Polynomial other) {
        int retDegree = Math.max(this.getDegree(), other.getDegree());
        double[] retCoeffArray = new double[retDegree + 1];
        for(int i = 0; i<Math.min(coeffs.length,  other.coeffs.length); ++i) {
            retCoeffArray[i] = this.coeffs[i] + other.coeffs[i];
        }

        for(int i = Math.min(coeffs.length, other.coeffs.length); i <retDegree + 1;++i) {
            if(coeffs.length > other.coeffs.length) {
                retCoeffArray[i] = this.coeffs[i];
            } else {
                try {
                    retCoeffArray[i] = other.coeffs[i];
                } catch(ArrayIndexOutOfBoundsException e) {
                    retCoeffArray[i] = 0;
                }
            }
        }
        Polynomial retVal = new Polynomial(retCoeffArray);
        return retVal;
    }

    public Polynomial multiply(Polynomial a) {
        double[] xcoeffs = new double[this.getDegree() + a.getDegree()];
        Polynomial x = new Polynomial(xcoeffs);
        for(int i = 0;i<this.getDegree();++i) {
            for(int j = 0;j<a.getDegree();++j) {
                x.coeffs[i+j] += this.coeffs[i] + a.coeffs[j];
            }
        }
        return x;
    }
}