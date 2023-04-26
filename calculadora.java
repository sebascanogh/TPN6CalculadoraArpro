package tpnro6calculadora;

import java.util.Scanner;
public class calculadora {
	 public double sumar(double unNumero, double otroNumero) {
	        return unNumero + otroNumero;
	    }

	    public double restar(double unNumero, double otroNumero) {
	        return unNumero - otroNumero;
	    }

	    public double multiplicar(double unNumero, double otroNumero) {
	        return unNumero * otroNumero;
	    }

	    public double dividir(double unNumero, double otroNumero) {
	        if (otroNumero == 0) {
	            throw new IllegalArgumentException("No se puede dividir por cero.");
	        }
	        return unNumero / otroNumero;
	    
	    }


	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 calculadora calculadora = new calculadora();

	        boolean salir = false;
	        while (!salir) {
	            System.out.println("Seleccione una operación:");
	            System.out.println("1. Sumar");
	            System.out.println("2. Restar");
	            System.out.println("3. Multiplicar");
	            System.out.println("4. Dividir");
	            System.out.println("5. Limpiar");
	            System.out.println("6. Salir");

	            int opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.println("Ingrese un número:");
	                    double numero1 = scanner.nextDouble();
	                    System.out.println("Ingrese otro número:");
	                    double numero2 = scanner.nextDouble();
	                    double resultadoSuma = calculadora.sumar(numero1, numero2);
	                    System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultadoSuma);
	                    break;

	                case 2:
	                    System.out.println("Ingrese un número:");
	                    double numero3 = scanner.nextDouble();
	                    System.out.println("Ingrese otro número:");
	                    double numero4 = scanner.nextDouble();
	                    double resultadoResta = calculadora.restar(numero3, numero4);
	                    System.out.println("La resta de " + numero3 + " y " + numero4 + " es: " + resultadoResta);
	                    break;

	                case 3:
	                    System.out.println("Ingrese un número:");
	                    double numero5 = scanner.nextDouble();
	                    System.out.println("Ingrese otro número:");
	                    double numero6 = scanner.nextDouble();
	                    double resultadoMultiplicacion = calculadora.multiplicar(numero5, numero6);
	                    System.out.println("La multiplicación de " + numero5 + " y " + numero6 + " es: " + resultadoMultiplicacion);
	                    break;

	                case 4:
	                    System.out.println("Ingrese un número:");
	                    double numero7 = scanner.nextDouble();
	                    System.out.println("Ingrese otro número:");
	                    double numero8 = scanner.nextDouble();
	                    try {
	                        double resultadoDivision = calculadora.dividir(numero7, numero8);
	                        System.out.println("La división de " + numero7 + " y " + numero8 + " es: " + resultadoDivision);
	                    } catch (IllegalArgumentException ex) {
	                        System.out.println("Error: " + ex.getMessage());
	                    }
	                    break;

	                case 5:
	                    // Limpiar la consola
	                    System.out.print("\033[H\033[2J");
	                    System.out.flush();
	                    break;

	                case 6:
	                    salir = true;
	                    break;

	                default:
	                    System.out.println("Opcion invalida. Intente de nuevo.");
	                    break;

	}
	        
	        }

	}
}
