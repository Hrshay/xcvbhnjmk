package Microsoft.database;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployeeBusiness implements CRUD{

	@Override
	public void add() throws SQLException, IOException{
		// TODO Auto-generated method stub
		String insert="insert into tblemployee values(113, 'Nyla', 'Canada', 1000000)";
		Statement s1=dbconnection.data().createStatement();
		s1.execute(insert);
	}

	@Override
	public void delete() throws SQLException, IOException {
		// TODO Auto-generated method stub
		String delete="delete from tblemployee where Eid=111";
		Statement s1=dbconnection.data().createStatement();
		s1.execute(delete);
	}

	@Override
	public void update() throws SQLException, IOException{
		// TODO Auto-generated method stub
		String update="update tblemployee set Eid=111 where Eid=112";
		Statement s1=dbconnection.data().createStatement();
		s1.execute(update);
	}
	
	@Override
	public void display() throws SQLException, IOException{
		// TODO Auto-generated method stub
		String display="select *from tblemployee";
		Statement s1=dbconnection.data().createStatement();
		ResultSet rSet=s1.executeQuery(display);
		
		while (rSet.next()) {
			System.out.println(rSet.getInt(1)+' '+rSet.getString(2)+' '+rSet.getString(3)+' '+rSet.getInt(4));
		}
	}
   
}
