import java.util.Scanner;

public class Uclass 
{
    public static void main(String[] args)
    {
       int a = 10;
        System.out.print("value of a is" + a);
        Scanner myObj =new Scanner(System.in);
        String userName ;
        System.out.println("Enter UserName");
        userName =myObj.nextLine ();
        System.out.println("UserName is:"+userName);
        myObj.close();
    }
}