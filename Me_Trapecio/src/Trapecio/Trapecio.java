package Trapecio;

import java.text.DecimalFormat;

public class Trapecio {

    DecimalFormat dec = new DecimalFormat("#.000");
    private float a, b, n, function, h;
    private static float A = 0;

    private static float fi, fa, fb, sum = 0, resultado, multiplica, variable;
    int v;
    float dimension[];

    Trapecio(float n, float b, float a, float variable) {
        this.n = n;
        this.b = b;
        this.a = a;
        this.v = (int) n;
        v = (int) n;
        
        this.variable = variable;
    }

    public float getVariable() {
        return variable;
    }

    public void setVariable(float variable) {
        Trapecio.variable = variable;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getN() {
        return n;
    }

    public float CalcularH() {
        h = (b - a) / n;
        A = a;

        return h;
    }

    public float Calcular_X() {

        v = v + 1;

        for (int i = 1; i < (v - 1); i++) {
            a = a + h;
            dimension[i] = a;
        }

        dimension[0] = A;
        dimension[v - 1] = b;

        return 0;

    }

    public String Datox() {

        System.out.println("" + v);
        String men = "";
        v = v + 1;
        dimension = new float[v];
        for (int i = 1; i < (v - 1); i++) {
            a = a + h;
            dimension[i] = a;
        }

        dimension[0] = A;
        dimension[v - 1] = b;

        for (int i = 0; i < v; i++) {
            
            men+= "\n" + "El valor de x " + i + " = " + dec.format(dimension[i]);
        }
        return men;
    }

    public float Funcion() {
        for (int i = 0; i < v; i++) {
//
//
            fi = variable + (dimension[i] * dimension[i]);
            return dimension[i] = fi;
        }
        fa = dimension[0];
        fb = dimension[v - 1];

        for (int i = 0; i < v; i++) {
            System.out.println("El valor de: f" + i + "(x)= " + dec.format(dimension[i]));

        }
        for (int i = 1; i < (v - 1); i++) {
            multiplica = dimension[i] * 2;

            return sum + multiplica;
        }
        return 0;
    }

    public float Resultado() {
        for (int i = 0; i < v; i++) {

            fi = variable + (dimension[i] * dimension[i]);
            dimension[i] = fi;
        }
        fa = dimension[0];
        fb = dimension[v - 1];

        //nos aseguramo qu ehaya sido reemplasado
        for (int i = 0; i < v; i++) {
            System.out.println("El valor de: f" + i + "(x)= " + dec.format(dimension[i]));

        }
        //multiplicamos por 2 desde x1 hasta x(n-1)

        for (int i = 1; i < (v - 1); i++) {
            multiplica = dimension[i] * 2;

            sum = sum + multiplica;
        }
        System.out.println("\n");

        //mostrar los resultados
        resultado = ((h / 2) * (sum + fa + fb));
        
        //resultado = ((h / 2) * (sum + fa + fb));

        return resultado;
    }

    public static void main(String[] args) {
        Trapecio trape = new Trapecio(5, 6, 8, 2);

        System.out.println("");
        System.out.println("");
        System.out.println("Funcion f(x) = (" + trape.getVariable());
        System.out.println("Total de iteraciones             :" + trape.getN());
        System.out.println("limite superior              :" + trape.getB());
        System.out.println("limite inferior             :" + trape.getA());
        System.out.println("El valor de h           :" + trape.CalcularH());
        System.out.println("El valor de x " + trape.Datox() + "\n");
        System.out.println("VAlor de f            :" + trape.Funcion() + "\n");
        System.out.println("Resultado            :"+trape.Resultado()+"\n");
    }
}
