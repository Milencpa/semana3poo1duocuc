package model;

    /**
     *Representa la información de una persona como su rut, nombre, apellido y dirección
     * @author milenperalta
     * @version 1.0
     */

public class Persona {
    private String rut;
    private String nombre;

        /**
         * Constructor que inicializa la información de la persona
         * @param rut
         * @param nombre
         */
    public Persona(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

        public void mostrarInformacion() {
        System.out.println("Rut: " + this.rut);
        System.out.println("Nombre: " + this.nombre);
        }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


        /**
         *
         * @return la información de la persona como String
         */
    @Override
    public String toString() {
        return "Rut= " + rut +
                ", nombre= " + nombre;
    }
}