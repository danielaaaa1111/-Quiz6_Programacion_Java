import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Crear un objeto Scanner para la entrada de datos.


        // Se solicita al usuario ingresar información sobre la figura.

        System.out.print("Ingrese el nombre de la figura: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el color de la figura: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo): ");
        int tipo = scanner.nextInt();

// Para un círculo, solicitar el radio.

        if (tipo == 1) {
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();

            // Crear un objeto de la clase FiguraGeometrica que es un círculo.

            FiguraGeometrica figura = new Circulo(nombre, color, radio);

            // Calcular y mostrar el área y el perímetro del círculo.

            System.out.println("Área: " + figura.obtenerArea());
            System.out.println("Perímetro: " + figura.obtenerPerimetro());
        } else if (tipo == 2) {

            // Para un rectángulo, solicitar los lados.

            System.out.print("Ingrese el valor del lado 1 del rectángulo: ");
            double lado1 = scanner.nextDouble();

            System.out.print("Ingrese el valor del lado 2 del rectángulo: ");
            double lado2 = scanner.nextDouble();

            // Crear un objeto de la clase FiguraGeometrica que es un rectángulo.

            FiguraGeometrica figura = new Rectangulo(nombre, color, lado1, lado2);

            // Calcular y mostrar el área y el perímetro del rectángulo.

            System.out.println("Área: " + figura.obtenerArea());
            System.out.println("Perímetro: " + figura.obtenerPerimetro());
        } else if (tipo == 3) {

            System.out.print("Ingrese el valor de la base del triángulo: ");
            double base = scanner.nextDouble();

            System.out.print("Ingrese el valor de la altura del triángulo: ");
            double altura = scanner.nextDouble();


            FiguraGeometrica figura = new Triangulo(nombre, color, base, altura);
            System.out.println("Área: " + figura.obtenerArea());
            System.out.println("Perímetro: " + figura.obtenerPerimetro();
        } else {
            System.out.println("Tipo de figura no válido");
        }

        scanner.close();
    }
}

