
package Trapecio;

import java.text.DecimalFormat;


public class Trapecio {
    DecimalFormat dec = new DecimalFormat("#.000");
    private static float a,b,n,function,h,dimen,A=0;
    private static float fi, fa, fb, sum=0, resultado, multiplica,variable;
    private static int v= (int) n;

    float dimension []= new float[v];
    Trapecio(float n,float b,float a,float variable){
        this.n=n;
        this.b=b;
        this.a=a;
        this.variable=variable;
    }

    public  float getVariable() {
        return variable;
    }

    public  void setVariable(float variable) {
        Trapecio.variable = variable;
    }

    public  float getA() {
        return a;
    }

    public  void setA(float a) {
        Trapecio.a = a;
    }

    public  float getB() {
        return b;
    }

    public  void setB(float b) {
        Trapecio.b = b;
    }

    public  float getN() {
        return n;
    }

    public  void setN(float n) {
        Trapecio.n = n;
    }
    
    public float CalcularH(){
        h= (b-a)/n;
        A=a;
       return h;
    }
    
    public float Calcular_X(){
        v= v+1;

    for(int i=1; i<(v-1);i++) {
        a=a+h;
        dimension[i]=a;
    }
        dimension[0] = A;
        dimension[v-1] = b;
        return 0;

    }
    public String Datox(){
        for (int i=0; i<v; i++){
    return ("\n"+"El valor de x " +i+ " = " + dec.format(dimension[i]));
    }
        return "";
    }
    public float Funcion(){
        for (int i=0; i<v; i++){
    
        fi = variable +(dimension[i]*dimension[i]);
        return dimension [i] = fi;
        }       
        fa = dimension [0];
        fb = dimension [v-1];

    for(int i=0; i<v; i++){
            System.out.println("El valor de: f" +i+ "(x)= " +dec.format(dimension[i]) );
            
    }
    for(int i=1; i<(v-1); i++){
    multiplica = dimension [i]*2;
    
    return  sum + multiplica;
    }
        return 0;


    }
 public float Resultado (){
        resultado = ((h/2)*(sum+ fa+ fb));
    
    return resultado;
    }
}