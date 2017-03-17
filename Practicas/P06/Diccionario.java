import java.io.*;
public class Diccionario{

  public static String[] palabras = new String [100];
  public static String[] traduccion = new String [100];
  public static String palabra, traducir;
  public static int i;
  public static boolean salir = false;

  public static void crearDiccionario()throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println( i + ".- Ingrese la palabra en Espanol: "); palabras[i] = br.readLine();
    System.out.println( i + ".- Ingrese la traduccion en Ingles: "); traduccion[i] = br.readLine();
  }//creardiccionario

  public static void traducir()throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println( i + ".- Ingrese la palabra a traducir: "); traducir = br.readLine();

    for(i = 0; i< palabras.length; i++){
      if(traducir.equalsIgnoreCase(palabras[i])){
        System.out.println("Traduccion: " + traduccion[i]);
      }
    }

    for(i = 0; i< traduccion.length; i++){
      if(traducir.equalsIgnoreCase(traduccion[i])){
        System.out.println("Traduccion: " + palabras[i]);
      }
    }
  }//traducir


  public static void main (String[] args)throws IOException{


    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    while (i < 100 && salir != true){
      crearDiccionario();
      System.out.println("Desea agregar otra palabra? [1 - Si / 0 - No]");
        int aux = Integer.parseInt(br.readLine());
      if(aux == 0){
        salir = true;
      }
      i++;
    }

    salir = false;
    i=0;
    System.out.println("\nAqui podra elegir las palabras a traducir.\n");
    while (salir != true){
      traducir();
      System.out.println("Desea traducir otra palabra? [1 - Si / 0 - No]");
      int aux = Integer.parseInt(br.readLine());
      if(aux == 0){
        salir = true;
      }
      i++;
    }

  }//main

}//class