import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the char - ");
        
        //First Way
        int a = scanner.next().charAt(0);
        System.out.println("ASCII - " + a);
          
        //Second Way
        System.out.println("Enter the char - ");
        char b = scanner.next().charAt(0);
        System.out.println("ASCII - " + (int) b);
      
  }
}
