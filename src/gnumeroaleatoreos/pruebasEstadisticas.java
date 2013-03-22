/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gnumeroaleatoreos;

/**
 *
 * @author root
 */
public class pruebasEstadisticas {
    public void pruebasEstadisticas(){        
    System.out.println("hola");
    }
    
    public double disgribucionZ(double vector[]){     
        double media=0;
        double sumatoria=0;
        int contador=0;
        while(contador<vector.length){
            sumatoria=sumatoria+vector[contador];
            contador++;
            
        }
        media=sumatoria/vector.length;
        
        double Zc=((media-0.5)*Math.sqrt((double)vector.length))/Math.sqrt((double)1/(double)12);
        return Zc;
    }
    
    public double KolmogorovSmith(double vector[]){     
        double Fe[]=vector;
        double Ft[]=new double[vector.length];       
        double FtFe[]=new double[vector.length];       
        
        
        
        double auxiliar=Fe[0];
        
        int contador=0;
        int contador2=0;
        
        while (contador2<Fe.length) {            
            while(contador<Fe.length-1){
            if (Fe[contador]>Fe[contador+1]) {
                auxiliar=Fe[contador];
                Fe[contador]=Fe[contador+1];
                Fe[contador+1]=auxiliar;                
                //System.out.println("v:"+Fe[contador]+" v+1: "+Fe[contador+1]);
            }else{
                //System.out.println("v:"+Fe[contador]+" v+1: "+Fe[contador+1]);
            }                                            
            contador++;
        }while(contador<Fe.length-1){
            if (Fe[contador]>Fe[contador+1]) {
                auxiliar=Fe[contador];
                Fe[contador]=Fe[contador+1];
                Fe[contador+1]=auxiliar;                
                //System.out.println("v:"+Fe[contador]+" v+1: "+Fe[contador+1]);
            }
            contador++;
        }
            contador=0;
            contador2++;
        }
        
                
        contador=0;
        
        while (contador<Ft.length) {            
            Ft[contador]=((float)(contador+1))/((float)Ft.length);
            contador++;
            
        }
        
        contador=0;
        while (contador<Ft.length) {            
            FtFe[contador]=Math.abs(Ft[contador]-Fe[contador]);            
            contador++;
        }         
        
        contador=0;        
        double Zc=FtFe[0];        
        while(contador<FtFe.length){
            if (FtFe[contador]>Zc) {
                Zc=FtFe[contador];
            }
                
                contador++;
            }
        return Zc;
    }
    
}


