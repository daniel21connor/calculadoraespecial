
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
    } System.out.print("\n el factorial es:"+  Factorial);
    }
       static void AreaDeUnTriangulo (){
           
       System.out.println("operacion de area de un triangulo");
        double Vasee, Alturaa, Areaa;
       System.out.println("\ningrese la base, para calcular del area:");
       Vasee=scanner.nextDouble();
       System.out.println("\n ingresa la altura, para el calculo del area ");
       Alturaa=scanner.nextDouble();
        Areaa= Vasee*Alturaa/2;
        System.out.println("el area del triangulo es;" +  Areaa);
      }
        static void Potencia(){
         System.out.println("\n Ingresa el numero de base:");
         int base=scanner.nextInt();
         System.out.println("\n ingresa numero del exponente:");
         int exponente=scanner.nextInt();
         System.out.println("\n el resultado es:"+Potencia (base, exponente));
       
     
    }
    public static int Potencia (int base, int exponente){
        if  (exponente==0) {
            return 1;
            
        }else {
            return base*Potencia(base, exponente-1);
             
     
    }
       }
    
    static void Salida (){
    System.out.println("Gracias por usar la calculadora especial");
    }
 }

   
    
    

    


