import java.util.Scanner;
public class PrimeNumbers {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter starting number: ");
int start = input.nextInt();
System.out.print("Enter ending number: ");
int end = input.nextInt();
int count = 0;
for (int i = start; i <= end; i++) {
if (isPrime(i)) count++;
}
int[] primes = new int[count];
int index = 0;
for (int i = start; i <= end; i++) {
if (isPrime(i)) primes[index++] = i;
}
System.out.println("Prime numbers from " + start + " to " + end + ":");
for (int i = 0; i < primes.length; i++) {
System.out.print(primes[i] + " ");
}
System.out.println();
input.close();
}
static boolean isPrime(int n) {
if (n < 2) return false;
for (int i = 2; i <= Math.sqrt(n); i++) {
if (n % i == 0) return false;
}
return true;
}
}
