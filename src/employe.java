import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLOutput;
import java.util.Scanner;
public class employe {
    public static void main(String []args)
    {
        int empcode,mobile,salary;
        String name,designation,Compneyname,email,password;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
        }
        catch (Exception e){
            System.out.println((e));
        }
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
                    System.out.println("Enter employe code:--");
                    empcode=sc.nextInt();
                    System.out.println("Enter the name of employee:--");
                    name=sc.next();
                    System.out.println("Enter the designation:--");
                    designation=sc.next();
                    System.out.println("Enter Salary:--");
                    salary=sc.nextInt();
                    System.out.println("Enter compney name:--");
                    Compneyname=sc.next();
                    System.out.println("Enter mobile number:--");
                    mobile=sc.nextInt();
                    System.out.println("Enter email:--");
                    email=sc.next();
                    System.out.println("Enter password");
                    password=sc.next();
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
                        String sql="INSERT INTO `employe`(`empcode`, `name`, `designation`, `salary`, `Compneyname`, `mobile`, `email`, `password`) VALUES (?,?,?,?,?,?,?,?)";
                        PreparedStatement stmt=con.prepareStatement((sql));
                        stmt.setInt(1,empcode);
                        stmt.setString(2,name);
                        stmt.setString(3,designation);
                        stmt.setInt(4,salary);
                        stmt.setString(5,Compneyname);
                        stmt.setInt(6,mobile);
                        stmt.setString(7,email);
                        stmt.setString(8,password);
                        stmt.executeUpdate();
                        System.out.println("value inserted successfully.........!");




                    }


                    catch (Exception e){
                        System.out.println((e));
                    }
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
