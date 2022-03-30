
package calculadoraespecial;
import java.util.Scanner; // usamos esto para, poder usar el Scanner 

public class CalculadoraEspecial {
 static  Scanner scanner=new Scanner (System.in);  //se escribe fuera del void para que sea una vaiable global
 
    public static void main(String[] args) {
    
      
     int opcion=0; //aca se pone opcion fuera del do para que pueda ser escogida en el do como variable global
  // usamos do para poder repetir el menu
  do{
         
     
    System.out.print("\n Bienvenidos a calculadora especial:");
    System.out.print("\n 1. Raiz cuadrada");
    System.out.print("\n 2. numero factorial");
    System.out.print("\n 3. area de un triangulo");
    System.out.print("\n 4. potencia");
    System.out.print("\n5. salir ");
     System.out.print("\n Escoja la operacion que desea");
       opcion=scanner.nextInt();
     
           switch(opcion){
         case 1 -> RaizCuadrada();
 
            
         case 2 -> NumeroFactorial(); 
         
          case 3 -> AreaDeUnTriangulo (); 
          
          case 4 -> Potencia ();
          
          
          case 5 -> Salida ();
     
     
     
         }//aca el while cerrara el menu hasta que se de la opcion 5 cual es la salida
     }while (opcion !=5);
     }
       //aca todo lo hacemos por void  y como nos damos cuenta que la variable scanner es global que se puede hacer en toda las operaciones
    static void RaizCuadrada(){
        System.out.println("operacion De raiz cuadrada");
          System.out.print("\ningresa el numero de que quieres sacar raiz");
        int num= scanner.nextInt();
        double raiz = Math.sqrt(num);
       System.out.print("\n la raiz del numero"+num +"es=" +raiz);
    }
       static void NumeroFactorial(){
        System.out.println("operacion de  factorial");
     System.out.print("\n escribe el numero que quieres factorial");
        
      int numero = scanner.nextInt();
      int Factorial = 1;
      while(numero !=0){
          Factorial*=numero;
          numero --; 
    }

   
    
    

    


