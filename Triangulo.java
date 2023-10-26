public class Triangulo {

        private double base;
        private double altura;
        private double hipotenusa;

        public Triangulo(String nombre, String color, double base, double altura) {
            super ("nombre,color");
            this.base = base;
            this.altura = altura;
            this.hipotenusa = Math.sqrt(base * base + altura * altura);
        }

        @Override
        public double obtenerArea() {
            return 0.5 * base * altura;
        }

        @Override
        public double obtenerPerimetro() {
            // El perímetro de un triángulo es la suma de sus tres lados.
            return base + altura + hipotenusa;

            // En este caso, estamos asumiendo que el tercer lado es la hipotenusa.

        }
    }
