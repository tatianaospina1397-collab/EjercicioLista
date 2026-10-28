package EjercicioLista;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utilidades u = new Utilidades();
        boolean seguir = false;
        while(seguir){
             switch(u.menu(sc)){
                case 1:
                    System.out.println("Registrar una venta");
                    break;
                case 2:
                    System.out.println("Mostrar las ventas");
                    break;
                case 3:
                    System.out.println("Buscar una venta");
                    break;
                case 4:
                    System.out.println("Modificar una venta");
                    break;
                case 5:
                    System.out.println("Cancelar una venta");
                    break;
                case 6:
                    System.out.println("Eliminar una venta");
                    break;
                case 7:
                    System.out.println("Generar un informe");
                    break;
                case 8:
                    seguir = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
       
    }
}