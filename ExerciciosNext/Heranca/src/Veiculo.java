public class Veiculo {
    public String marca;
    public String modelo;
    public boolean possuiPortas;
    public int numeroPortas;
    public boolean possuiRodas;
    public int numeroRodas;
    public boolean possuiAsas;
    public boolean possuiHelice;

    Veiculo() {}
    public Veiculo(
            String marca, String modelo,
            boolean possuiPortas, int numeroPortas,
            boolean possuiRodas, int numeroRodas,
            boolean possuiAsas, boolean possuiHelice) {
    }

    public class Carro extends Veiculo {
        public static final boolean possuiPortas = true;
        public static final boolean possuiRodas = true;
        public static final int numeroRodas = 4;
        public static final boolean possuiAsas = false;
        public static final boolean possuiHelice = false;
        Carro() {}
        Carro(String marca, String modelo, boolean possuiPortas,
              int numeroPortas, boolean possuiRodas, int numeroRodas,
              boolean possuiAsas, boolean possuiHelice) {

            super(marca, modelo, possuiPortas, numeroPortas, possuiRodas, numeroRodas, possuiAsas, possuiHelice);
        }
        public class SUV extends Carro {
            public static final String modelo = "SUV";

            SUV() {
            }

            SUV(String marca, int numeroPortas) {
                super(marca, modelo, possuiPortas, numeroPortas, possuiRodas, numeroRodas, possuiAsas, possuiHelice);
                this.marca = marca;
                this.numeroPortas = numeroPortas;
            }
        }
        public class Caminhonete extends Carro {
            public static final String modelo = "Caminhonete";

            Caminhonete() {}
            Caminhonete(String marca, int numeroPortas) {
                super(marca, modelo, possuiPortas, numeroPortas, possuiRodas, numeroRodas, possuiAsas, possuiHelice);
                this.marca = marca;
                this.numeroPortas = numeroPortas;
            }
        }
        public class Hatch extends Carro {
            public static final String modelo = "Hatch";

            Hatch() {}
            Hatch(String marca, int numeroPortas) {
                super(marca, modelo, possuiPortas, numeroPortas, possuiRodas, numeroRodas, possuiAsas, possuiHelice);
                this.marca = marca;
                this.numeroPortas = numeroPortas;
            }
        }
    }
    public class Moto extends Veiculo {
        public static final boolean possuiPortas = false;
        public static final boolean possuiRodas = true;
        public static final int numeroRodas = 2;
        public static final boolean possuiAsas = false;
        public static final boolean possuiHelice = false;

        Moto() {}
        Moto(String marca, String modelo, boolean possuiPortas,
             int numeroPortas, boolean possuiRodas, int numeroRodas,
             boolean possuiAsas, boolean possuiHelice) {

            super(marca, modelo, possuiPortas, numeroPortas, possuiRodas, numeroRodas, possuiAsas, possuiHelice);
        }
    }
}
