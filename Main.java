import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        long a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        a = sc.nextLong();
        if(a <= 128 && a >= -128) {   //byte range is -128 to 128
            System.out.println("Entered number is byte data type");
        }else if (a <= 32767 && a >= -32767) { //short range is -32767 to 32767
            System.out.println("Entered number is short data type");
        }else if (a <= 2147483647 && a >= -2147483648){ //integer range is -2147483647 to 2147483647
            System.out.println("Entered number is integer data type");
        }else { //long range is -9223372036854775807 to 9223372036854775807
            System.out.println("Entered number is long data type");
        }
    }
}