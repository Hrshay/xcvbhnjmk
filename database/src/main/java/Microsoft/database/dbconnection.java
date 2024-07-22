package Microsoft.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dbconnection {
    public static Connection data() throws IOException, SQLException{
    	File f1=new File("C:\\Users\\Harsh\\Documents\\workspace-spring-tool-suite\\database\\src\\main\\java\\Microsoft\\database\\db.properties");
    	FileInputStream f2=new FileInputStream(f1);
    	Properties p1=new Properties();
    	p1.load(f2);
    	String url=p1.getProperty("url");
    	String user=p1.getProperty("user");
    	String pass=p1.getProperty("password");
    	
    	Connection connection=DriverManager.getConnection(url, user, pass);
    	return connection;
    }

	public static Object connection() {
		// TODO Auto-generated method stub
		return null;
	}
}
