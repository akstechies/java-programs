// How to Read and Print an Integer value in Java

import java.io.*;
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        int yourName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls Enter Any Number - ");
        yourName = scanner.nextInt();
        System.out.println("Hello, You have entered " + yourName + "!");
    }
}
