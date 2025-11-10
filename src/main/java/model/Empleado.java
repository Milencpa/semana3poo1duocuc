package model;

    /**
     *Representa la información del empleado
     * @author milenperalta
     * @version 1.0
     */

public class Empleado extends Persona {
    private String cargo;
    private String sueldo;
    private Direccion direccion;

        public Empleado(String rut, String nombre, String cargo, String sueldo, Direccion direccion) {
            super(rut, nombre);
            this.cargo = cargo;
            this.sueldo = sueldo;
            this.direccion = direccion;
        }

        public void mostrarInformacion() {
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public String getSueldo() {
            return sueldo;
        }

        public void setSueldo(String sueldo) {
            this.sueldo = sueldo;
        }

        public Direccion getDireccion() {
            return direccion;
        }

        public void setDireccion(Direccion direccion) {
            this.direccion = direccion;
        }

        @Override
        public String toString() {
        return super.toString() +
                ", Cargo= " + cargo + ", Sueldo= " + sueldo + ", dirección= " + direccion;}
    }