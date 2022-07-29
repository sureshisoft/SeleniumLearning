package seleniumExamples;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTesting {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//note JDBC myslq jar file should be added in maven respoistory

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","admin");
		System.out.println("Connection got Establised sucessfully");
		Statement st=con.createStatement();
		
	ResultSet rs=st.executeQuery("select * from actor");
	while(rs.next())
	{
		String Name=rs.getString("first_name");
		System.out.println("Name avaiable in Databse:"+ Name);
	}
	}

}
