import java.util.Scanner;

public class b1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ;
        System.out.println("nhap vao chuoi: ");
        s=sc.nextLine();
        System.out.println("------");
        //hàm length
//        System.out.println(s.length());
        // hàm charAT()
        for ( int i = 0 ; i<s.length();i++)
        {

            System.out.println("Vi tri " + i + " la: " + s.charAt(i));
        }
    }
}
