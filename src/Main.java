import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Starting program\n");
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = cin.nextInt();
        if (num>7){
            System.out.println("Hello");
        }
        System.out.println("Enter a name");
        String name = cin.next();
        String msg = name.equals("John") ? "Hello, John" : "There is no such name";
        System.out.println(msg);
        System.out.println("Enter array size");
        int n = cin.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = cin.nextInt();
        }
        for (int i = 0; i < n; i++) {
            array[i] = array[i]*3;
        }
        for (int i = 0 ;i<n;i++){
            System.out.println(array[i]);
        }
    }
}