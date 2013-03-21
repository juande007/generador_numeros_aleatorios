/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gnumeroaleatoreos;

/**
 *
 * @author CHEMEKO
 */
public class Verificar {
    double m,a,c,x0; 
    int  base;
    int palabra;

    boolean v1=false,v2=false,v3=false,v4=false;        //una para cada tipo de A.
    boolean cv1;                                        //verifica la calidad de C.
    boolean mx;
     
     
 public Verificar(String mt,String at, String ct, String x0t, String baset, String palt){
        System.out.println("aqui->"+palt+ " "+ baset);
        this.m=Double.parseDouble(mt);
        this.a=Double.parseDouble(at);
        this.c=Double.parseDouble(ct);   
        this.x0=Double.parseDouble(x0t);
        this.palabra=Integer.parseInt(palt);
        this.base=Integer.parseInt(baset);
    }
     
     
 public double formula_mixto(){
        double xi=((x0*a)+c)%m;
        x0=xi;
        xi=xi/m;    
        return xi;
    }
    
public double formula_multi(){
        double xi=(x0*a)%m;
        x0=xi;
        xi=xi/m; 
        return xi;
    }
     
public void analisar_mixto(){}

public void analisar_multi(){}

static double maximoComunDivisor(double a, double b) {
	   if (b==0) 
	     return a;
	   else
	     return maximoComunDivisor(b, a % b);
	}
 public boolean validaSiSonPrimosRelativos(double A,double B){
      
        if(maximoComunDivisor(A,B)==1){            
            System.out.println("Son primos relativos");
            return true;
        }else{
            System.out.println("No son primos relativos");
            return false;
        }    
 }
 
 
 
 
 
 
}

