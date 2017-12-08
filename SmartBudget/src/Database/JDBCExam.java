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
	String tableName = "budget";

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

	public void productInsert(Data data) {// 추가
		try {
			String queryString = "INSERT INTO budget (`date`, `price`, `in_out`, `card`,`kinds`,`name`) VALUES" + " ('"
					+ data.get_date() + "', '" + data.get_price() + "', '" + data.get_in_out() + "', '"
					+ data.get_card() + "', '" + data.get_kinds() + "', '" + data.get_name() + "');";

			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			// resultValue =
			statement.executeUpdate(queryString);

			System.out.println("insert complete");

		} catch (SQLException e) {
			System.out.println("[쿼리 오류]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
		}
	}

	public void productDelete(Data data) {// 삭제
		try {
			String queryString = "DELETE FROM budget where date = '" + data.get_date() + "' and price = '"
					+ data.get_price() + "' and in_out =  '" + data.get_in_out() + "' and card =  '" + data.get_card()
					+ "' and kinds =  '" + data.get_kinds() + "' and name = '" + data.get_name() + "';";

			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			// resultValue =
			statement.executeUpdate(queryString);

			System.out.println("Delete complete");

		} catch (SQLException e) {
			System.out.println("[쿼리 오류]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
		}
	}

	public void productSelectOne(String date) {
		try {
			String queryString = "SELECT * FROM budget WHERE date = '"+ date +"';";
			
			connection = DriverManager.getConnection(url, user, password);
			
			statement = connection.createStatement();
			
			resultSet = statement.executeQuery(queryString);
			
			while (resultSet.next())
			{
				System.out.println(resultSet.getString("date") + "\t" + resultSet.getInt("price") +
						"\t" + resultSet.getInt("in_out") +"\t"+  resultSet.getInt("card") +"\t"+
						resultSet.getInt("kinds") +"\t"+resultSet.getString("name"));
			}
		}
		catch (SQLException e)
		{
			System.out.println("[쿼리 오류]\n" + e.getStackTrace());
		}
		finally
		{
			closeDatabase();
		}
	}
}
