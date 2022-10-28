
    public class Util {
        //Declarando una variable ,constanteS eSTATICAS
        public  static final double DOLARES =6.91;
        public  static final double EUROS = 6.73;
        public  static final double ARGENTINO = 21.33;

        public Util() {
        }
        public static double bolivianosPesos(double bolivianos){
            return bolivianos*ARGENTINO;
        }
    }
