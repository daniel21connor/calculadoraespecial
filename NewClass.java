
package calculadoraespecial;


public class NewClass {

    private final double resulltado;

    public double raizCuadrada(double raiz){
        
     double num = Math.sqrt(raiz);
     return  num;
     
    }
    public double numeroFactorial(int numero ) {
    int factorial  = 1;
      while (numero!=0){
       factorial*=numero;
       numero --;
      }
      return numero;
    }
      public double area(int vase, int altura){
         int area = Math.multiplyExact(vase, altura/2);
         return area;
      }
      
      public double potenciaDeUnNumero (double numero, double potencia){
          double resultado= Math.pow(numero,  potencia);
          return resultado;
      }

    /**
     * @return the resulltado
     */
    public double getResulltado() {
        return resulltado;
    }
   public NewClass() {
        this.resulltado =Math.random();
    }
              
}




