/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asel
 */
public class CustomerDBUtil {
    public static List<Customer>validate(String username, String password){
		
		ArrayList<Customer> cus = new ArrayList<>();
		
		//create db connection
		String url = "jdbc:mysql://localhost:3306/hotel";
		String user = "";
		String pass = "";
		
		//validate
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pass);
			Statement stmt = con.createStatement();
			
			String sql = "select * from customer where username = '"+username+"'and password = '"+password+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userU = rs.getString(5);
				String passU = rs.getString(6);
				
				Customer c = new Customer(id, name, email, phone, userU, passU);
				cus.add(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return cus;
	}
}
