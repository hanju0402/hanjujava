package signUp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SignUpDAO {
	
	public static List<Customer> getMembers() throws Exception {
		String query = "select name, age, tell from Member";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Customer> list = new ArrayList<>();
		
		try{	
			conn = DBUtil.getConnection();
			
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery(query);
			
			while(rs.next()){
				Customer customer = new Customer(rs.getString("name"), rs.getInt("age"), rs.getString("tell"));
				list.add(customer);
			}
		} finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return list;
	}
}
