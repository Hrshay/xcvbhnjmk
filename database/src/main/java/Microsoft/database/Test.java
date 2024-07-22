package Microsoft.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {
    static final String url="jdbc:mysql://localhost:3306/combine";
    static final String user="root";
    static final String pass="LmbSia@2024";
    static final String driver="com.mysql.jdbc.Driver";
    final static String insert="insert into tblemployee" +"(Eid, Ename, city, salary) values(111,'Ana','Hyd',85000)";
    static String update;
    static String seleString="select Eid, Ename, city, salary from tblemployee";
    public static void main(String[] args) throws SQLException {
    	Connection con=DriverManager.getConnection(url, user, pass);
    	Statement st=con.createStatement();
    	st.executeUpdate(seleString);
    	
    	ResultSet rSet=st.executeQuery(seleString);
    	       while (rSet.next()) {
				System.out.println(rSet.getInt(1)+" "+rSet.getString(2)+" "+rSet.getString(3));
				
			}
    			System.out.println("Connection done");
    }
}
