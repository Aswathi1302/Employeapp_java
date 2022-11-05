import java.sql.SQLOutput;
import java.util.Scanner;
public class employe {
    public static void main(String []args)
    {
        int choice;
        while(true)
        {
            System.out.println("*******EMPLOYEE*******)");

            System.out.println("1.Add Employe");
            System.out.println("2.View Employe");
            System.out.println("3.Search Employe");
            System.out.println("4.Update Employe");
            System.out.println("5.delete Employe");
            System.out.println("6.Exit");
            System.out.println("*****************");
            System.out.println("ENTER YOUR CHOICE:--");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Ënter employe  Details:--");
                    break;
                case 2:
                    System.out.println("View Employe Details:--");
                    break;
                case 3:
                    System.out.println("Search employe:--");
                    break;
                case 4:
                    System.out.println("Update Employe Details:--");
                    break;
                case 5:
                    System.out.println("Delete Employe  Details:--");
                    break;
                case 6:
                    System.exit(0 );
            }



        }

    }
}
