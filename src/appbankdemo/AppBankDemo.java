
package appbankdemo;
import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author pablo
 */
public class AppBankDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);  // Create a Scanner object
        int opcion = 0;
        double saldoDisponible = 1599.99;
        
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        
        System.out.println("******************************");
        System.out.println("\n Nombre del Cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + saldoDisponible + "$" );        
        System.out.println("\n ******************************");
        
        String menu = """
                      *** Escriba el número de la opción deseada ***
                      1 - Consultar Saldo
                      2 - Retirar
                      3 - Depositar
                      9 - Salir
                      """;
        
        
        
        while (opcion <= 8){ 
            
//            System.out.println("*** Escriba el número de la opción deseada ***");
//            System.out.println("1 - Consultar Saldo");
//            System.out.println("2 - Retirar");
//            System.out.println("3 - Depositar");
//            System.out.println("9 - Salir");
            opcion = teclado.nextInt();  // Read user input
            
            
            double dineroRetirar = 0;
            double dineroDepositar = 0;
            
            switch (opcion){
                
                case 1:
                    System.out.println("El saldo Actualizado es:" + saldoDisponible + "$" );
                    
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que deseas retirar?");
                    dineroRetirar = teclado.nextDouble();  // Read user input
                    
                    if (dineroRetirar > saldoDisponible){
                        System.out.println("Saldo Insuficiente");
                    }else{
                        saldoDisponible = saldoDisponible - dineroRetirar;
                        System.out.println("Saldo restante: " + saldoDisponible + "$" );
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que deseas depositar?");
                    dineroDepositar = teclado.nextDouble();  // Read user input
                    
                    if (dineroDepositar >= 0){
                        saldoDisponible = saldoDisponible + dineroDepositar;
                        System.out.println("Saldo Actualizado es: " + saldoDisponible + "$" );
                    }
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por utilizar nuestros servicios");
//                    opcion = 9;
                    break;
                    
                default:
                    
            } //Fin Switch
            
            //opcion = 0;
        
        }//fin while
    }
    
}
