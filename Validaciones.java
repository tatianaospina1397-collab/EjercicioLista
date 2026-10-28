package EjercicioLista;

import java.util.Scanner;

public class Validaciones {
    public int validarentero(Scanner sc){
        while(!sc.hasNextInt()){
            System.out.println("Por favor ingresar un digito numerico ");
             sc.next(); 
        }
        return sc.nextInt();
    }

    public Double validardouble(Scanner sc){
        while(!sc.hasNextDouble()){
            System.out.println("Por favor ingresar un digito numerico ");
             sc.next(); 
        }
        return sc.nextDouble();
    }
}
