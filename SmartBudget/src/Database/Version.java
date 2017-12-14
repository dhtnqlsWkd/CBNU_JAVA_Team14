package Database;

import java.sql.*;

public class Version {
	Connection connection;
	Statement statement;
	ResultSet resultSet;

	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/budget";
	String user = "paki1019";
	String password = "wlsgh123";
	String tableName = "version";

	public Version() {
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

	public int versioncheck() {
		int return_num = 0;
		try {
			String queryString = "SELECT ver FROM version;";

			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			resultSet = statement.executeQuery(queryString);

			resultSet.next();

			return_num = resultSet.getInt("ver");
		} catch (SQLException e) {
			System.out.println("[쿼리 오류]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
			return return_num;
		}
	}

	public void versionupdate(int update_num) {
		int ver_num1 = versioncheck();
		int ver_num2 = update_num;
		try {
			String queryString = "UPDATE version set ver = " + ver_num2 + " where ver = " + ver_num1 + ";";
			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			// resultValue =
			statement.executeUpdate(queryString);

			System.out.println("update complete");

		} catch (SQLException e) {
			System.out.println("[쿼리 오류]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
		}
	}

}
