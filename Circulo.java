
    // Clase derivada Circulo
    class Circulo extends FiguraGeometrica {
    // Radio del circulo
        private double radio;

        // Constructor de la clase Circulo que recibe nombre, color y radio.
        public Circulo(String nombre, String color, double radio) {

            // Llama al constructor de la clase base.
            super(nombre, color);
            // Inicializa el radio del círculo.
            this.radio = radio;
        }

        // Método para calcular y obtener el área del círculo.
        @Override
        public double obtenerArea() {
            //Formula para calcular el area
            return Math.PI * radio * radio;
        }

        // Método para calcular y obtener el perímetro del círculo.
        @Override
        public double obtenerPerimetro() {
            return 2 * Math.PI * radio;
        }
    }


