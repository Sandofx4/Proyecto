package principal;

import java.util.ArrayList;

public class BuscadorCita {

    public static void buscarCitaPorCedula(ArrayList<Cita> agenda, int cedula) {
        boolean encontrada = false;
        for (Cita cita : agenda) {
            if (cita.getId() == cedula) {
                System.out.println("Cita encontrada: " + cita);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontro ninguna cita con ese numero de cedula.");
        }
    }
}
