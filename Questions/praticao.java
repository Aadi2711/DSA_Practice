import java.util.Scanner;
public class praticao {
    static String reverse(String a){
        String b ="";
        for(int i = a.length() ; i > -1;i--){
            b += String.valueOf(i);
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        String a = sc.next();
        sc.close();
        System.out.println(reverse(a));
    }
}
