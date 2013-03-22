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
    int palamiz;
   String[] resultadomulti = new String[3];
   double[] tempmulti = new double[5];
    String[] proponermulti = new String[3];
   // int[]pb = new int[1];
//////////////
    
    
     
    
    ///////////////////
  //  boolean v1=false,v2=false,v3=false,v4=false;        //una para cada tipo de A.
    //boolean cv1;                                        //verifica la calidad de C.
    boolean mx;
     
     
 public Verificar(String mt,String at, String ct, String x0t, String baset, String palmizt){
        this.m=Double.parseDouble(mt);
        this.a=Double.parseDouble(at);
        this.c=Double.parseDouble(ct);   
        this.x0=Double.parseDouble(x0t);
        this.palamiz=Integer.parseInt(palmizt);
        this.base=Integer.parseInt(baset);
        proponermulti[0]="";proponermulti[1]="";
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
     
//public void analisar_mixto(){}

//public void analisar_multi(){

//validar M !!!!
    //saber_m_multi();
//validar A !!!!
    
//validar x0 !!!   
//}

public String proponer_multi_m(){
System.out.println("entre a funcion");
    if(resultadomulti[0]!=null){
        
        System.out.println("entre a if");
    proponermulti[0]="UN MEJOR VALOR PARA M SERIA: "+tempmulti[0];
    return proponermulti[0];
    
    }
   else
        return"VALOR ACTUAL DE M ES BUENO";
      
}
public String proponer_multi_a(){
 if(resultadomulti[1]!=null){
    proponermulti[1]="UN MEJOR VALOR PARA A SERIA: "+tempmulti[1]+" o "+tempmulti[2];
    return proponermulti[1];
    } 
 else
return"VALOR ACTUAL DE A ES BUENO";
}
public String proponer_x0_multi(){
  if(resultadomulti[2]!=null){
    proponermulti[2]="UN MEJOR VALOR PARA X0 SERIA: "+tempmulti[3]+" o "+tempmulti[4];
    return proponermulti[2];
    } 
 else
return"VALOR ACTUAL DE X0 ES BUENO";
}  

/////////////////////////////////////////////////////////////////////////
public String saber_m_multi(){
    double msaber= Math.pow(base, palamiz);
    tempmulti[0]=msaber;
    if(msaber!=m)
        { 
            resultadomulti[0]="VALOR DE M ES MALO";
            return"VALOR DE M ES MALO";
        }
    else
        {
            return"VALOR DE M ES BUENO";
        }
}

public String saber_a_multi(){
   int partent;
    int ai= (int)a;
    boolean salida=false;
     boolean salidap=false;
      boolean salidan=false;
    if(base==10){
    
  partent=ai/200;
   System.out.println(partent+"acaaaaaaaaaaaaaaaaaa");
   int count=0;
   int auxn=0;
   int auxp=0;
   
   while(salida==false){
     
   auxn=200*(partent+count)-21;   
   auxp=200*(partent+count)+21;
   if(a==auxn){salidan=true;salida=true;}
   if(a==auxp){salidap=true;salida=true;}
   if(auxp>a&&auxn>a){salida=true;}
     count++;  
   }
      if(auxp>a&&auxn>a){resultadomulti[1]="VALOR DE A NO VALIDO";tempmulti[1]=auxn;tempmulti[2]=auxp;return"VALOR DE A NO VALIDO";}
      if(salidan==true)return"VALOR VALIDA POR EL LADO NEGATIVO";
      if(salidap==true)return"VALOR VALIDA POR EL LADO POSITIVO";
           
    }
    
    else
    {
   partent=ai/8;
   System.out.println(partent+"acaaaaaaaaaaaaaaaaaa");
   int count=0;
   int auxn=0;
   int auxp=0;
   
   while(salida==false){
     
   auxn=8*(partent+count)-3;   
   auxp=8*(partent+count)+3;
   if(a==auxn){salidan=true;salida=true;}
   if(a==auxp){salidap=true;salida=true;}
   if(auxp>a&&auxn>a){salida=true;}
     count++;  
   }
      if(auxp>a&&auxn>a){resultadomulti[1]="VALOR DE A NO VALIDO";tempmulti[1]=auxn;tempmulti[2]=auxp;return"VALOR DE A NO VALIDO";}
      if(salidan==true)return"VALOR VALIDA POR EL LADO NEGATIVO";
      if(salidap==true)return"VALOR VALIDA POR EL LADO POSITIVO";
   
    }
    
    return"NO ENTENDER";

}

public String saber_x0_multi(){
    boolean flagx0=false;
     if(base==2){
         
            if(esImpar(x0)==true&&validaSiSonPrimosRelativos(x0,m)==true){
          //  System.out.println("SAPBEEEEE");
           resultadomulti[2]=null;
             return"EL VALOR DE X0 ES BUENO";
            }
             else
            {
               //     System.out.println("NO SAPBEEEEE"); 
                 resultadomulti[2]="EL VALOR DE X0 ES MALO";tempmulti[3]=11;tempmulti[4]=39;
                    return"EL VALOR DE X0 ES MALO";       
            }
     }   
            
    else
    {
       if(esImpar(x0)==true&&validaSiSonPrimosRelativos(x0,m)==true&& x0%3!=0 && x0%5!=0){
         // System.out.println("deciSAPBEEEEE");
            resultadomulti[2]=null;
             return"EL VALOR DE X0 ES BUENO";  
       }  
       else {
          ///  System.out.println("deciNO SAPBEEEEE"); 
           resultadomulti[2]="EL VALOR DE X0 ES MALO";tempmulti[3]=11;tempmulti[4]=77;
                    return"EL VALOR DE X0 ES MALO"; 
       }
    }
}

//////////////////////////////////////////////////////////////////////////
static double maximoComunDivisor(double a, double b) {
	   if (b==0) 
	     return a;
	   else
	     return maximoComunDivisor(b, a % b);
	}
 public boolean validaSiSonPrimosRelativos(double A,double B){
      
        if(maximoComunDivisor(A,B)==1){  
            
            return true;
        }else
        {
            return false;
        }    
 }
 
 
 public boolean esImpar(double iNumero) {
  if (iNumero%2!=0)
    return true;
  else
    return false;
}
}

