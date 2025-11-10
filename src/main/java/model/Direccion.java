package model;
    /**
     *Representa una direccion de una calle, ciudad, comuna y region
     * @author milenperalta
     * @version 1.0
     */
public class Direccion {
        private String calle;
        private String ciudad;
        private String comuna;
        private String region;


        /**
         * Constructor que inicializa los datos de una dirección
         *
         * @param calle
         * @param ciudad
         * @param comuna
         * @param region
         */
        public Direccion(String calle, String ciudad, String comuna, String region) {
            this.calle = calle;
            this.ciudad = ciudad;
            this.comuna = comuna;
            this.region = region;
        }

        public void mostrarInformacion() {
            System.out.println("Calle: " + calle);
            System.out.println("Ciudad: " + ciudad);
            System.out.println("Comuna: " + comuna);
            System.out.println("Region: " + region);
        }

        public String getCalle() {
            return calle;
        }

        public void setCalle(String calle) {
            this.calle = calle;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public String getComuna() {
            return comuna;
        }

        public void setComuna(String comuna) {
            this.comuna = comuna;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        /**
         * Retorna una representacion en String de la dirección
         *
         * @return la dirección como String
         */
        @Override
        public String toString() {
            return " [calle=" + calle + ", ciudad=" + ciudad + ", comuna=" + comuna + ", region=" + region + "]";
        }

    }
