
    public class yo extends Padre {
        int celular;

        public yo(String nombre, String primerApellido, String segundoApellido, String CI, int celular) {
            super(nombre, primerApellido, segundoApellido, CI);
            this.celular = celular;
        }

        public int getCelular() {
            return celular;
        }
        public void setCelular(int celular) {
            this.celular = celular;
        }
    }

