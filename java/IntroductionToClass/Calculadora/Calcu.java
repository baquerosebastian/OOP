package calcu;

public class Calcu {
    int x;
    int y;
    int r;
    
public Calcu(int a, int b, int c){
    x=a;
    y=b;
    r=c;
}

public int suma(int a, int b){
    x=a;
    y=b;
    r=a+b;
    return r;
}

public int resta(int a, int b){
    x=a;
    y=b;
    r=a-b;
    return r;
}

public int multiplicacion(int a, int b){
    x=a;
    y=b;
    r=a*b;
    return r;
}

public double division(int a, int b){
    x=a;
    y=b;
    r=a/b;
    return r;
}

public void imprimir(){
    System.out.println("El resultado es: " + r);
}
    public static void main(String[] args) {
     Calcu obj = new Calcu(0,0,0);
     obj.suma(10, 5);
     obj.imprimir();
     obj.resta(20, 5);
     obj.imprimir();
     obj.multiplicacion(20, 2);
     obj.imprimir();
     obj.division(50, 2);
     obj.imprimir();
          
     }
    
}
