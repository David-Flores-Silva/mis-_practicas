import java.util.*;

public class ejerc3{
  public static void main(String [] args){ 
    Scanner tecla = new Scanner(System.in);

    System.out.println("ingrese la cantidad del arreglo");
    int cant = tecla.nextInt();
    int arr[] = new int [cant];

    //rellena la matriz
    for(int i=0; i<arr.length; i++){
      double a = Math.random()*10;
      arr[i] = (int)a;
    }

    //imprime la matriz
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+", ");
    }
    System.out.println();

    System.out.println("ingrese un valor de la matriz para buscar su posicion: -> ");
    int valor = tecla.nextInt();
    int pose = 0;

    int x=0;
    int y=0;
    for(int i=0; i<arr.length; i++){
        if(valor > arr[i]){
          x++;
        }else if(valor==arr[i]){
        }else{
          y++;
        }
    }
    pose = (cant-y)-1;

    System.out.println("la posicion del valor: "+valor+", es: "+pose);
    System.out.println("recuerda: en posiciones de valores en una matriz, se cuenta desde el 0");
  }
}
