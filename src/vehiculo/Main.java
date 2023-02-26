
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoJimenezDiazAlejandro2223 miVehiculoJimenezDiazAlejandro2223;
        int stockActual;
        
        miVehiculoJimenezDiazAlejandro2223 = new VehiculoJimenezDiazAlejandro2223("Seat",18000,100);
        
        
        operativaVehiculosJimenezDiazAlejandro2223(miVehiculoJimenezDiazAlejandro2223, 50); 
    }

    private static void operativaVehiculosJimenezDiazAlejandro2223(VehiculoJimenezDiazAlejandro2223 miVehiculoJimenezDiazAlejandro2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoJimenezDiazAlejandro2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoJimenezDiazAlejandro2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoJimenezDiazAlejandro2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
