package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {
    public static void main(String[] args) {

        Direccion direccion1 = new Direccion("Carrizal alto 293", "Puerto Montt", "Puerto Montt", "Los Lagos");
        Direccion direccion2 = new Direccion("Avenida Argentina 958", "Puerto Montt", "Puerto Montt", "Los Lagos");
        Direccion direccion3 = new Direccion( "Pasaje Bauxita 4244", "Puerto Montt", "Puerto Montt", "Los Lagos");

        Empleado empleado1 = new Empleado("12345678-9", "Catalina Arancibia", "Operario de explotaciones acuícolas", "660,000", direccion1);
        Empleado empleado2 = new Empleado("23874396-1", "Matias Segovia", "Electromecánico", "590,000", direccion2);
        Empleado empleado3 = new Empleado("19988623-3", "Skarlet Saavedra", "Jefe(a) de Área Producción", "990,000", direccion3);

        System.out.println("--- Salmonera SALMONTT ---");
        System.out.println("Lista de Empleados: ");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
    }

}
