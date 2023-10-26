// Clase base FiguraGeometrica
    class FiguraGeometrica {
        private String nombre;
        private String color;

    // Constructor de la clase FiguraGeometrica que recibe el nombre y el color.


    public FiguraGeometrica(String nombre, String color) {
            this.nombre = nombre;
            this.color = color;
        }

    // Método que devuelve el área de la figura. Debe ser implementado en clases derivadas.
        public double obtenerArea() {
            return 0.0;
        }

        public double obtenerPerimetro() {
            return 0.0;
        }
    // Método para obtener el nombre de la figura.
        public String getNombre() {
            return nombre;
        }

    // Método para obtener el color de la figura.
        public String getColor() {
            return color;
        }
    }

