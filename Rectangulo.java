
    class Rectangulo extends FiguraGeometrica {
        private double lado1;
        private double lado2;


        // Constructor de la clase Rectangulo que recibe nombre, color y su respectivo lado
        public Rectangulo(String nombre, String color, double lado1, double lado2) {
            super(nombre, color);
            this.lado1 = lado1;
            this.lado2 = lado2;
        }

        // Método para calcular y obtener el área del rectángulo

        @Override
        public double obtenerArea() {
            return lado1 * lado2;
        }

        @Override
        public double obtenerPerimetro() {
            return 2 * (lado1 + lado2);
        }
    }

