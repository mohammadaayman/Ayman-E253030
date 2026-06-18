import java.util.Scanner;
public class EvenNumbers {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter starting number: ");
int start = input.nextInt();
System.out.print("Enter ending number: ");
int end = input.nextInt();
int count = 0;
int i = start;
while (i <= end) {
if (i % 2 == 0) count++;
i++;
}
int[] evens = new int[count];
int index = 0;
i = start;
while (i <= end) {
if (i % 2 == 0) evens[index++] = i;
i++;
}
int j = 0;
do {
System.out.print(evens[j] + " ");
j++;
} while (j < evens.length);
System.out.println("Even numbers from " + start + " to " + end + ":");
System.out.println();
input.close();
}
}
