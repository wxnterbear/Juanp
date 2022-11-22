
package fin;


public class A {
    
    public double a ;  //basico
    public double b ;  //vhed
    public double c ; //total dev
    public double d ; //pension
    public double e ; //salud
    public double f ; //total ded
    public double g ; //total pagar


    public void basico(double num1 , int num2){

        a = (num1/30)*num2;

    }

    public void vhed(double num1, int num3){

        b = (((num1/30/8)*0.25)+(num1/30/8))*num3;

    }

    public void totalDev(){

        c = a + b;

    }

    public void pension(double num1){

        d = num1 * 0.04;

    }

    public void salud(double num1){

        e = num1 * 0.04;

    }

    public void totalDed(){

        f = d + e;

    }

    public void totalPagar(){

        g = c - f;

    }
}
    

