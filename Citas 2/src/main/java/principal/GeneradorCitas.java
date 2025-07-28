package principal;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author AXEL R
 */
public class GeneradorCitas {


    private ArrayList<Cita> agenda;
    private Scanner scanner;

    // Constructor1
    public GeneradorCitas() {
        agenda = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // 1. Generar cita
    public void generarCita() {
        System.out.print("Numero de Cedula : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Descripción de la cita: ");
        String desc = scanner.nextLine();
        agenda.add(new Cita(id, desc));
        System.out.println("Cita generada correctamente.");
    }

    // 2. Ver citas programadas
    public void verCitas() {
        if (agenda.isEmpty()) {
            System.out.println("No hay citas programadas.");
            return;
        }
        System.out.println("Citas programadas:");
        for (Cita c : agenda) {
            System.out.println(c);
        }
    }

    // 3. Eliminar cita
    public void eliminarCita() {
        System.out.print("Numero de Cedula para eliminar cita: ");
        int id = Integer.parseInt(scanner.nextLine());
        agenda.removeIf(c -> c.getId() == id);
        System.out.println("Cita eliminada si existía.");
    }

    // 4. Buscar cita específica
    public void buscarCita() {
    System.out.print("Numero de cedula: ");
    int id = Integer.parseInt(scanner.nextLine());
    BuscadorCita.buscarCitaPorCedula(agenda, id);
}


    // 5. Asociar factura
    public void asociarFactura() {
    System.out.print("Número de cédula para asociar factura: ");
    int id = Integer.parseInt(scanner.nextLine());

    for (Cita c : agenda) {
        if (c.getId() == id) {
            System.out.print("¿La cita tiene cobro? (si/no): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                System.out.print("Ingrese el monto del cobro: ");
                double monto = Double.parseDouble(scanner.nextLine());

                c.setTieneCobro(true);
                c.setMonto(monto);

                System.out.println(" Factura asociada con cobro: ₡" + monto);
            } else {
                c.setTieneCobro(false);
                c.setMonto(0);
                System.out.println(" Cita marcada como sin cobro.");
            }
            return;
        }
    }

    System.out.println("Cita no encontrada para asociar factura.");
}

    
}
