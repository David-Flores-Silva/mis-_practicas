import java.util.*;

public class div_ven{
  public static void main(String [] args){
    Scanner tecla = new Scanner(System.in);    
    
    System.out.print("ingrese el tamaño del arreglo: -> ");
    int tam = tecla.nextInt();
    int [] arr = new int[tam];

    for(int i=0; i<arr.length; i++){
      arr[i] = tecla.nextInt();
    }

    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + ", ");
    }
    System.out.println();



    if(tam%2==0){
      //buscar los dos valores centrales, sumarlos y dividir entre dos y devolver
      int b=0;
      int c=0;
      for(int i=0; i<arr.length; i++){
        int x=0;
        int y=0;
        for(int j=0; j<arr.length; j++){
          if(arr[i]>arr[j]){
            x++;
          }else if(arr[i]==arr[j]){
          }else{
            y++;
          }
        }
 
        if(x+1 == y){
          b = arr[i];
        }else if(x == y+1){
          c = arr[i];
        }
      }
      int resultado = (b+c)/2;
      System.out.println(resultado);

    }else{
      //solo buscar el valor central
      //misma cantidad a la derecha y misma cantidad a la izquierda
       for(int i=0; i<arr.length; i++){
         int x=0;
         int y=0;
         for(int j=0; j<arr.length; j++){
           if(arr[i]>arr[j]){
             x++;
           }else if(arr[i]==arr[j]){
           }else{
             y++;
           }
         }
         
         if(x == y){
           System.out.println(arr[i]);
         }
       }
    }





  }
}
