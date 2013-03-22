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
        return Math.abs(Zc);
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
    
    public String convertirEnTrama(int valor, int lon){
        
        int nDigitos= Integer.toString((int) Math.floor(valor)).length();
            String num1="";
            if(nDigitos<lon){
                for (int i = 0; i < (lon-nDigitos); i++) {
                    num1=num1+"0";
                }
            num1=num1+valor;
            }else{
                num1=Integer.toString(valor);
            }
            return num1;
    
    }
    
    public void pruebaDistancias(double vector[],int tam){
         int Lhueco=10;
         int[] fOi=new int[Lhueco];  
        int contador=0;
        String trama1="";      
        String trama2="";      
        String trama3="";  
        
        double vectorEnInt[]=new double[vector.length];
        String numero[]=new String[vector.length];
        while(contador<vector.length){
            vectorEnInt[contador]=(vector[contador])*Math.pow(10,tam);            
            numero[contador]=convertirEnTrama((int)vectorEnInt[contador], tam);            
            contador++;
        }
        /*
        while(contador<vector.length){
            vectorEnInt[contador]=(vector[contador])*Math.pow(10,tam);            
            numero[contador]=convertirEnTrama((int)vectorEnInt[contador], tam);            
            contador++;
        }
        */
        char[] primerTrama = numero[0].toCharArray();
        char[] segundaTrama = numero[1].toCharArray();
        char[] tercerTrama = numero[2].toCharArray();
        char[] ventana= new char[10];
        int carro=0;
        int posicionEnTrama=0;
        contador=3;
        
        for (int j = 0; j < ((numero.length*tam)-10); j++) {   
            
         
         for (int i = 0; i < 10; i++) {
             if (carro<5) {
                 ventana[i]=primerTrama[carro];
             }else{     
                 if(((carro)-5)<5){
                     ventana[i]=segundaTrama[(carro)-5];
                 }else{
                     ventana[i]=tercerTrama[carro-10];
                 }
                 
             }
              carro++;
              System.out.printf(""+ventana[i]);                          
              //******* proceso de conteo              
        }
         if(j<((numero.length*tam)-10)){
             boolean band=false;
                       
             int contadorNumeros=0;
             if(contadorNumeros<(Lhueco-1))             
             while (contadorNumeros<(Lhueco-1) & !band ) { 
                 if (ventana[0]!=ventana[contadorNumeros+1]) {
                    contadorNumeros++; 
                 }else{
                 band=true;
                 }
                 //System.out.println("contador="+contadorNumeros);
                 
             }
             System.out.println("Salio");
             fOi[contadorNumeros]=fOi[contadorNumeros]+1;        
        }
         
         
         posicionEnTrama++;
         carro=posicionEnTrama;
            System.out.println("fin "+j);
            
            
                primerTrama = segundaTrama;
                segundaTrama = tercerTrama;
                if (posicionEnTrama==4) {    
                if (contador<numero.length) {
                tercerTrama = numero[contador].toCharArray();                
            }
                
                posicionEnTrama=0;
                carro=0;
                contador++;
            }
        }
        for (int i = 0; i < fOi.length; i++) {
            System.out.println("foi "+i+" res "+fOi[i]);
            
        }
        
        double[] pi=new double[Lhueco]; 
         for (int i = 0; i < pi.length; i++) {
             System.out.println("entro");
             if (i==0) {
                 pi[0]=((Math.pow(0.9, 0))*0.1);
             }else{
                 if(i==(pi.length-1)){
                     System.out.println("entro2");
                 pi[i]=Math.pow(0.9,i);  
                 }else{
                 pi[i]=Math.pow(0.9,i)*0.1;  
                 }
             
             }            
            
        }
        
         for (int i = 0; i < fOi.length; i++) {
            System.out.println("pi "+i+" res "+pi[i]);
            
        }
        
        //hacerlo para huecos variados
        
                
    
    }
    
}


