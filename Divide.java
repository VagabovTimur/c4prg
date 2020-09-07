import java.util.Scanner;
public class Divide
{
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("zadejte libovolne cislo:");
        n = scan.nextInt();
        if(n % 7 == 0)
        {
            System.out.println(n+ "cislo je delitelne 7");
        }
        else
        {
            System.out.println(n+" cislo neni delitelne 7");
        }

        scan.close();
    }
}
