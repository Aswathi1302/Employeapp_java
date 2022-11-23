import java.sql.*;
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
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
                        String sql="SELECT `empcode`, `name`, `designation`, `salary`, `Compneyname`, `mobile`, `email`, `password` FROM `employe`";
                        Statement stmt=con.createStatement();
                        ResultSet rs=stmt.executeQuery(sql);

                        while ((rs.next())) {
                            String getempcode = rs.getString(("empcode"));
                            String getname = rs.getString(("name"));
                            String getdesignation = rs.getString(("designation"));
                            String getsalary = rs.getString(("salary"));
                            String getCompneyname = rs.getString(("Compneyname"));
                            String getmobile = rs.getString(("mobile"));
                            String getemail = rs.getString(("email"));
                            String getpassword = rs.getString(("password"));
                            System.out.println("Employe code=" + getempcode);
                            System.out.println("Name=" + getname);
                            System.out.println("Designation=" + getdesignation);
                            System.out.println("salary=" + getsalary);
                            System.out.println("Compney name=" + getCompneyname);
                            System.out.println("mobile=" + getmobile);
                            System.out.println("email=" + getemail);
                            System.out.println("password=" + getpassword);
                        }


                    }
                    catch (Exception e){
                        System.out.println((e));
                    }
                    break;
                case 3:
                    System.out.println("Search employe:--");
                    System.out.println("Enter the Employee code:");
                    empcode=sc.nextInt();
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
                        String sql = "SELECT `name`, `designation`, `salary`, `Compneyname`, `mobile`, `email`, `password` FROM `employe` WHERE  empcode="+String.valueOf(empcode);
                        Statement stmt=con.createStatement();
                        ResultSet rs=stmt.executeQuery(sql);

                        while(rs.next()){
                            String getname = rs.getString(("name"));
                            String getdesignation = rs.getString(("designation"));
                            String getsalary = rs.getString(("salary"));
                            String getCompneyname = rs.getString(("Compneyname"));
                            String getmobile = rs.getString(("mobile"));
                            String getemail = rs.getString(("email"));
                            String getpassword = rs.getString(("password"));
                            System.out.println("Name=" + getname);
                            System.out.println("Designation=" + getdesignation);
                            System.out.println("salary=" + getsalary);
                            System.out.println("Compney name=" + getCompneyname);
                            System.out.println("mobile=" + getmobile);
                            System.out.println("email=" + getemail);
                            System.out.println("password=" + getpassword);
                        }
                    }
                    catch (Exception e){
                        System.out.println((e));
                    }


                    break;
                case 4:
                    System.out.println("Update Employe Details:--");
                    System.out.println("Enter the Employee code:");
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
                        String sql="UPDATE `employe` SET `name`='"+name+"',`designation`='"+designation+"',`salary`='"+String.valueOf(salary)+"',`Compneyname`='"+Compneyname+"',`mobile`='"+String.valueOf(mobile)+"',`email`='"+email+"',`password`='"+password+"' WHERE `empcode`="+String.valueOf(empcode);
                        Statement stmt=con.createStatement();
                        stmt.executeUpdate(sql);

                        System.out.println("Data updated  successfully.....");
                    }
                    catch (Exception e){
                        System.out.println((e));
                    }
                    break;
                case 5:
                    System.out.println("Delete Employe  Details:--");
                    System.out.println("Enter the Employee code:");
                    empcode=sc.nextInt();
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");
                        String sql ="DELETE FROM `employe` WHERE `empcode`="+String.valueOf(empcode);
                        Statement stmt=con.createStatement();
                        stmt.executeUpdate(sql);
                        System.out.println("deleted successfully.....");

                    }
                    catch (Exception e){
                        System.out.println((e));
                    }

                    break;
                case 6:
                    System.exit(0 );
            }



        }

    }
}
