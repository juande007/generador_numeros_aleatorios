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
    
}
