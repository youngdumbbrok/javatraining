package l;

import java.sql.*;
import java.util.Scanner;
public class loki {
    static final String DB_URL = "jdbc:mysql://localhost:3306/loki"; 
    static final String USER = "root";
    static final String PASS = "Welcome12#";
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    label:
    while(true)
    {
        System.out.println("select your role:\n1.Admin\n2.User\n3.exit\n");
        int mainoption= scan.nextInt();
        switch(mainoption)
        {
            case 1:
            //Admin
            while(true)
            {
                System.out.println("Select the operation:\n1.Add movie\n2.list user detials\n3.Exit");
                int adminopt= scan.nextInt();
                switch(adminopt)
                {
                    case 1:
                    //Add movie
                    System.out.println("Enter the details:");
                    Scanner scan1=new Scanner(System.in);
                    String details= scan1.nextLine();
                    String parts[]= details.split(" ");
                    String queryadd="INSERT INTO movie VALUES('"+parts[0]+ "','" +parts[1]+ "','" +parts[2]+ "','" +parts[3]+ "','" +parts[4]+"');";

                    try
                    {
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                    Statement stmt = conn.createStatement();
                                    stmt.executeUpdate(queryadd);
                                    
                                    
                                    System.out.println("Added successfully");
                                    System.out.println("***********************************************\n\n");
                    }
                    catch (SQLException e) 
                        {
                            e.printStackTrace();
                        }
                    break;
                    case 2:
                    //list user details
                    System.out.println("User details list");
                    try{
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM user");

                        while (rs.next()) {
                                                                
                            System.out.println(rs.getString("UserName")+" - "+rs.getInt("NoOfTickets"));
                            
                        }
                        
                    } 
                    catch (SQLException e) 
                        {
                            e.printStackTrace();
                        }
                    break;
                    case 3:
                    //exit admin operation
                    continue label;
                    default:
                    System.out.println("Invalid option");
                }
            }
            
            case 2:
            //User
            while(true)
            {
                System.out.println("Select the operation:\n1.See the movie list\n2.Book ticket\n3.Exit");
                int useropt= scan.nextInt();
                switch(useropt)
                {
                    case 1:
                    //movie list
                    System.out.println("Movies available:");
                    try{
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM movie");

                        while (rs.next()) {
                                    
                            if(rs.getInt("capacity")==0)
                            {
                                System.out.println(rs.getString("ShowName")+" - House Full");
                            }
                            else
                            
                                System.out.println(rs.getString("ShowName")+" -Available");
                            
                        }
                        
                    } 
                    catch (SQLException e) 
                        {
                            e.printStackTrace();
                        }

                    break;
                    case 2:
                    //book ticket
                    System.out.print("enter your name: ");
                    String username=scan.nextLine();
                    System.out.println("Select Movie to book");
                    try{
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM movie");
                        int i=1;
                        while (rs.next()) {
                                                       
                            System.out.println(i+"."+rs.getString("ShowName"));
                            i++;
                            
                        }
                        
                    } 
                    catch (SQLException e) 
                        {
                            e.printStackTrace();
                        }
                    int selection= scan.nextInt();
                    System.out.print("enter the number of tickets to book: ");
                    int ticketno= scan.nextInt();
                    try{
                        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                        stmt.executeUpdate("INSERT INTO user VALUES('0','"+username+"','"+ticketno+"');");                        
                        
                    } 
                    catch (SQLException e) 
                        {
                            e.printStackTrace();
                        }
                    switch(selection)
                    {
                        case 1:
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement stmt = conn.createStatement();
                                stmt.executeUpdate("UPDATE movie SET capacity= capacity-"+ticketno+" WHERE showID=1;");                        
                                                                
                                System.out.println("Ticket Booked successfully");
                                System.out.println("***********************************************\n");
                            } 
                            catch (SQLException e) 
                                {
                                    e.printStackTrace();
                                }
                        break;
                        case 2:
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement stmt = conn.createStatement();
                                stmt.executeUpdate("UPDATE movie SET capacity= capacity-"+ticketno+" WHERE showID=2;");                        
                                                                
                                System.out.println("Ticket Booked successfully");
                                System.out.println("***********************************************\n");
                            } 
                            catch (SQLException e) 
                                {
                                    e.printStackTrace();
                                }

                        break;
                        case 3:
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement stmt = conn.createStatement();
                                stmt.executeUpdate("UPDATE movie SET capacity= capacity-"+ticketno+" WHERE showID=3;");                        
                                                                
                                System.out.println("Ticket Booked successfully");
                                System.out.println("***********************************************\n");
                            } 
                            catch (SQLException e) 
                                {
                                    e.printStackTrace();
                                }

                        break;
                        case 4:
                            try{
                                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                                Statement stmt = conn.createStatement();
                                stmt.executeUpdate("UPDATE movie SET capacity= capacity-"+ticketno+" WHERE showID=4;");                        
                                                                
                                System.out.println("Ticket Booked successfully");
                                System.out.println("***********************************************\n");
                            } 
                            catch (SQLException e) 
                                {
                                    e.printStackTrace();
                                }

                        break;
                        default:
                        System.out.println("enter a valid option");
                    }


                    break;
                    case 3:
                    //exit user operation
                    continue label;
                    default:
                    System.out.println("Invalid option");
                }    
            }
            
            case 3:
            //exit
            return;

            default:
            System.out.println("enter a valid statement");
        }
    }

    }
    
}