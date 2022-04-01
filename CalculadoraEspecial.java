
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
     NewClass objetoUno=new NewClass();
   
           switch(opcion){
               
         case 1 : 
             System.out.println("denos el valor");
            double numero=scanner.nextDouble();
            System.out.print("el valor es" + objetoUno.raizCuadrada(numero));
             break;
           
 
            
         case 2 :
             System.out.println(objetoUno.getResulltado());
                      
         break;
          case 3 : 
              System.out.println("\ningrese la base, para calcular del area:");
              int  num=scanner.nextInt();
              System.out.println("\n ingresa la altura, para el calculo del area ");
             int altu=scanner.nextInt();
              System.out.println("el numero del area es " + objetoUno.area(altu, num));
          
          case 4 :
        System.out.println("\n Ingresa el numero de base:");
         int base=scanner.nextInt();
         System.out.println("\n ingresa numero del exponente:");
         int exponente=scanner.nextInt();
         System.out.println("la potencia del numero es = "+objetoUno.potenciaDeUnNumero(base, exponente));
          
          
          case 5 :Salida ();
    
     
     
         }//aca el while cerrara el menu hasta que se de la opcion 5 cual es la salida
     }while (opcion !=5);
     }
       //aca todo lo hacemos por void  y como nos damos cuenta que la variable scanner es global que se puede hacer en toda las operaciones
   
       static void numeroFactorial(){
        System.out.println("operacion de  factorial");
     System.out.print("\n escribe el numero que quieres factorial");
      int numero = scanner.nextInt();
      int Factorial = 1;
      while(numero !=0){
          Factorial*=numero;
          numero --; 
    } System.out.print("\n el factorial es:"+  Factorial);
    }
    
    
    static void Salida (){
    System.out.println("Gracias por usar la calculadora especial");
    }
 }

   
    
    

    


