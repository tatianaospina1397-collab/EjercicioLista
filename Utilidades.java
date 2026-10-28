package EjercicioLista;

import java.util.LinkedList;
import java.util.Scanner;

public class Utilidades {   
    Validaciones v = new Validaciones();
    public int menu(Scanner sc) {
        System.out.println("Bienvenido a la tienda de Pepito:");
        System.out.println("Seleccione una opción:");
        System.out.println("1.Registrar una venta");
        System.out.println("2. Mostrar las ventas");
        System.out.println("3. Buscar una venta");
        System.out.println("4. Modificar una venta");
        System.out.println("5. Cancelar una venta");
        System.out.println("6. Eliminar una venta");
        System.out.println("7. Generar un informe");
        System.out.println("8. Salir");
        int num = v.validarentero(sc);
        return num;
    }

    public LinkedList<ObjVenta> LlenarLista(LinkedList<ObjVenta> lista) {
        boolean pedir = true;
        while (pedir) {
            
            }
        }


    public static int  NumeroFactura(LinkedList<ObjVenta> lista) {
        int UltimaFactura = lista.size();
        return UltimaFactura ++;

    }

    public String PedirCliente(Scanner sc, int opt ) {
       switch (opt) {
            case 1:
               System.out.println("Ingrese el nombre del cliente:");
               
           default:
            System.out.println("Ingrese el nombre del vendedor ");
                break;    
        }
        return sc.next();
    }

    public static Double TotalVenta(Scanner sc, Validaciones v) {
        System.out.println("Ingrese el total de la venta:");
        return v.validardouble(sc);
    }

    public String DatosEnteros(Scanner sc, int opt ) {
       switch (opt) {
            case 1:
               System.out.println("ingrese la cantidad del producto:");
               
           default:
            System.out.println("Ingrese el estado de la venta 1: registrado 0: cancelado ");
                break;    
        }
        return v.validarentero(sc)
    }


    
}
