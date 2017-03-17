import java.util.Scanner;
public class Calculadora{

  public static int opcion;
  public static double a, b, c, resultado;

  public static void Menu(){
    System.out.println("\n\t1. Suma \n\t2. Restar\n\t3. Multiplicar \n\t4. Dividir\n\t5. Salir");
    System.out.println(" \n Seleccione la operación deseada:\n");
  }
  public static void Operaciones(){
    Scanner keyboard = new Scanner(System.in);
    opcion = keyboard.nextInt();
    

      switch(opcion){
        case 1:

        System.out.println("Ingrese el primer numero");
        a = keyboard.nextDouble();

        System.out.println("Ingrese el segundo numero");
        b = keyboard.nextDouble();

        c = MetodoSuma(a, b);
        System.out.println("El resultado de la Suma es: " + c);

        break;
        
        case 2:

        System.out.println("Ingrese el primer numero");
        a = keyboard.nextDouble();

        System.out.println("Ingrese el segundo numero");
        b = keyboard.nextDouble();

        c = MetodoResta(a, b);
        System.out.println("El resultado de la Resta es: " + c);

        break;

        case 3:

        System.out.println("Ingrese el primer numero");
        a = keyboard.nextDouble();

        System.out.println("Ingrese el segundo numero");
        b = keyboard.nextDouble();
        
        c = MetodoMult(a, b);
        System.out.println("El resultado de la Multiplicacion es: " + c);

        break;

        case 4:

        System.out.println("Ingrese el primer numero");
        a = keyboard.nextDouble();

        System.out.println("Ingrese el segundo numero");
        b = keyboard.nextDouble();

        if ( a <= 0 && b <= 0 ) {

        System.out.println("Error, no se puede dividir entre cero ningun numero.");

      } else {

        c = MetodoDiv(a, b);
        System.out.println("El resultado de la Division es: " + c);
      }


        break;

        case 5:

        System.out.println("\nHa elegido salir, Hasta luego.");
        System.exit(0);

        break;
      }
    }

  public static double MetodoSuma (double a, double b){
    resultado = a + b;
    return resultado;
  }
  public static double MetodoResta (double a, double b){
    resultado = a - b;
    return resultado;
  }
  public static double MetodoMult (double a, double b){
    resultado = a * b;
    return resultado;
  }
  public static double MetodoDiv (double a, double b){
    resultado = a/b;
    return resultado;
  }

  public static void main (String[] args){
    while( opcion!= 5 ){
      Menu();
      Operaciones();
    }
  }  
}