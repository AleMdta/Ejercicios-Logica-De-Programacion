package primeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        int[] primeNumbers = new int[10];
        int primeCount = 0;

        // Ingresar 10 numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        //Ciclo para separa los numeros primos y no primos
        for (int i = 0; i < 10; i++) {
            if (isPrime(numbers[i])) {
                primeNumbers[primeCount] = numbers[i];
                primeCount++;
            }
        }

        // Impresión d elos números primos al inico
        System.out.println("Prime Numbers at the beginning of the array:");
        for (int i = 0; i < primeCount; i++) {
            System.out.println("Index " + i + ": " + primeNumbers[i]);
        }

        //Impresión de los número no primos
        System.out.println("Non-Prime Numbers:");
        for (int i = 0; i < 10; i++) {
            if (!isPrime(numbers[i])) {
                System.out.println("Index " + i + ": " + numbers[i]);
            }
        }

        scanner.close();
    }

    // Función para saber si mi número es primo
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

