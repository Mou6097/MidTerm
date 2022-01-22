package datastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class UseMap {

	public static void main(String[] args) {
		Map<String, List<String>> list = new HashMap<String, List<String>>();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:imtiaz://localhost:1527/sample", "imtiaz", "1234");
			con = DriverManager.getConnection("jdbc:oracle:imtiaz:@localhost:1521:xe", "imtiaz", "1234");
			Statement stmt_cust = con.createStatement();
			Statement stmt_orders = con.createStatement();

			ResultSet rs = stmt_cust.executeQuery("select cid,name from customers");

			while (rs.next()) {
				int cust_id = rs.getInt(1);
				String cust_name = rs.getString(2);
				ResultSet rs_order = stmt_orders.executeQuery("select item_name from orders where orders.cid=" + cust_id);
				List<String> item_name = new ArrayList<>();
				while (rs_order.next()) {

					item_name.add(rs_order.getString(1));
				}
				if (!item_name.isEmpty()) {
					list.put(cust_name, item_name);
				}
				rs_order.close();
			}

			rs.close();
			stmt_cust.close();
			stmt_orders.close();
			for (Map.Entry<String, List<String>> entry : list.entrySet()) {
				String key = entry.getKey();
				for (String value : entry.getValue()) {
					System.out.println("Customer_Name:" + key + "\t Item Name:" + value);
				}
			}
		} catch (Exception exception) {
			System.out.println("There is a error in:" + exception.getMessage());
		}

	}

}
