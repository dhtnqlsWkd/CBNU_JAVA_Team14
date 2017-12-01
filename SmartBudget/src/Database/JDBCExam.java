package Database;
import java.sql.*;
import java.util.*;

public class JDBCExam {
	Connection connection;
	Statement statement;
	ResultSet resultSet;

	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/budget";
	String user = "paki1019";
	String password = "wlsgh123";

	public JDBCExam() {
		try {
			Class.forName(driverName);

		} catch (ClassNotFoundException e) {
			System.out.println("[로드 오류]\n" + e.getStackTrace());
		}
	}

	public void closeDatabase() {
		try {
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (SQLException e) {
			System.out.println("[닫기 오류]\n" + e.getStackTrace());
		}
	}

	public int productInsert(String p_date, int p_price, int p_in_out, int p_card) {
		int resultValue = 0;

		try {
			String queryString = "INSERT INTO budget (`data`, `price`, `in_out`, `card`) VALUES"
					+ " ('" + p_date + "', " + p_price + "', '" + p_in_out + "', '"+p_card + "')";

			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			resultValue = statement.executeUpdate(queryString);
			
		} catch (SQLException e) {
			System.out.println("[쿼리 오류]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
		}

		return resultValue;

	}
//	public int productDelete(String p_date,int p_price, int p_in_out, int p_card) {
//		
//	}
}