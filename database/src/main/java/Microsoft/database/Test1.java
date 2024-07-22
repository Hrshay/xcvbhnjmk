package Microsoft.database;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws SQLException, IOException{
    	EmployeeBusiness e1=new EmployeeBusiness();
    	Scanner sc=new Scanner(System.in);
    	while(true) {
    		System.out.println("Employee Mgnt Service");
    		System.out.println("1. Add Employee: ");
    		System.out.println("2. Delete Employee: ");
    		System.out.println("3. Update Employee: ");
    		System.out.println("4. Display Employee: ");
    		System.out.println("Enter your choice: ");
    		int x=sc.nextInt();
    		switch(x) {
    		case 1:
    		    e1.add();
    		    System.out.println("Data Inserted");
    		    break;
    		case 2:
    		    e1.delete();
    		    System.out.println("Data Deleted");
    		    break;
    		case 3:
    		    e1.update();
    		    System.out.println("Data Updated");
    		    break;
    		case 4:
    		    e1.display();
    		    System.out.println("Data Displayed");
    		    break;    
    		}
    	}
    }
}
