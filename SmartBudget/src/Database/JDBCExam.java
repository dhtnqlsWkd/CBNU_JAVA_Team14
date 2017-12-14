package Database;

import java.sql.*;
import java.util.*;

public class JDBCExam {
	Connection connection;
	Statement statement;
	ResultSet resultSet;

	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/budget?useUnicode=true&characterEncoding=utf8";
	String user = "paki1019";
	String password = "wlsgh123";
	String tableName = "budget";

	public JDBCExam() {
		try {
			Class.forName(driverName);

		} catch (ClassNotFoundException e) {
			System.out.println("[�ε� ����]\n" + e.getStackTrace());
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
			System.out.println("[�ݱ� ����]\n" + e.getStackTrace());
		}
	}

	public void productInsert(Data data) {// �߰�
		int ver = new Version().versioncheck();
		ver++;
		try {
			String queryString = "INSERT INTO budget VALUES" + " ('" + data.get_date() + "', '" + data.get_price()
					+ "', '" + data.get_in_out() + "', '" + data.get_card() + "', '" + data.get_kinds() + "', '"
					+ data.get_name() + "'," + ver + ");";

			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			// resultValue =
			statement.executeUpdate(queryString);
			new Version().versionupdate(ver);
			System.out.println("insert complete");

		} catch (SQLException e) {
			System.out.println("[���� ����]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
		}
	}

	public void productDelete(Data data) {// ����
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
			System.out.println("[���� ����]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
		}
	}

	public void productUpdate(Data data1, Data data2) {
		int ver = new Version().versioncheck();
		ver++;
		try {

			String queryString = "UPDATE budget set date = '" + data2.get_date() + "' , price = " + data2.get_price()
					+ " , in_out = " + data2.get_in_out() + " , card = " + data2.get_card() + " , kinds = "
					+ data2.get_kinds() + " , name = '" + data2.get_name() + "' where (date = '" + data1.get_date()
					+ "' and price = " + data1.get_price() + " and in_out = " + data1.get_in_out() + " and card = "
					+ data1.get_card() + " and kinds = " + data1.get_kinds() + " and name = '" + data1.get_name()
					+ "');";
			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			// resultValue =
			statement.executeUpdate(queryString);
			new Version().versionupdate(ver);
			System.out.println("update complete");

		} catch (SQLException e) {
			System.out.println("[���� ����]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
		}
	}

	public int productCountOne(String date) {
		int re_count = 0;
		try {
			String queryString = "SELECT count(price) FROM budget WHERE date = '" + date + "';";

			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			resultSet = statement.executeQuery(queryString);
			resultSet.next();
			re_count = resultSet.getInt("count(price)");

		} catch (SQLException e) {
			System.out.println("[���� ����]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
			return re_count;
		}
	}

	public Data productSelectOne(String date, int count) {// �ش� ��¥�� ������ ��ü�� ��ȯ
		Data re_data = null;
		try {
			String queryString = "SELECT * FROM budget WHERE date = '" + date + "';";

			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			resultSet = statement.executeQuery(queryString);
			for (int i = 0; i < count; i++)
				resultSet.next();

			re_data = new Data(resultSet.getString("date"), resultSet.getInt("price"), resultSet.getInt("in_out"),
					resultSet.getInt("card"), resultSet.getInt("kinds"), resultSet.getString("name"));

		} catch (SQLException e) {
			System.out.println("[���� ����]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
			return re_data;
		}
	}
	
	public int productSum_month(int year, int month, int i_o) {// �ش� �� �հ� �Ի�
		int return_num = 0;
		try {
			String queryString = "SELECT SUM(price) FROM budget WHERE (date between '" + year + "-" + month
					+ "-01' and '" + year + "-" + month + "-31') and (in_out=" + i_o + ");";

			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			resultSet = statement.executeQuery(queryString);

			resultSet.next();

			return_num = resultSet.getInt("sum(price)");
		} catch (SQLException e) {
			System.out.println("[���� ����]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
			return return_num;
		}
	}
	
	public int productSum_month_card(int year, int month, int i_o, int card) {// �ش� �� �հ� �Ի�
		int return_num = 0;
		try {
			String queryString = "SELECT SUM(price) FROM budget WHERE (date between '" + year + "-" + month
					+ "-01' and '" + year + "-" + month + "-31') and (in_out=" + i_o + ") and (card =" + card +");";

			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			resultSet = statement.executeQuery(queryString);

			resultSet.next();

			return_num = resultSet.getInt("sum(price)");
		} catch (SQLException e) {
			System.out.println("[���� ����]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
			return return_num;
		}
	}
	
	public int productSum_kinds(int year, int month, int i_o, int kinds) {// �ش� �� �հ� �Ի�
		int return_num = 0;
		try {
			String queryString = "SELECT SUM(price) FROM budget WHERE (date between '" + year + "-" + month
					+ "-01' and '" + year + "-" + month + "-31') and (in_out=" + i_o + ") and (kinds=" + kinds + ");";

			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			resultSet = statement.executeQuery(queryString);

			resultSet.next();

			return_num = resultSet.getInt("sum(price)");
		} catch (SQLException e) {
			System.out.println("[���� ����]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
			return return_num;
		}
	}

	public int productSum_day(int year, int month, int day, int i_o) {// �ش� �� �հ� ���
		int return_num = 0;
		try {
			String queryString = "SELECT SUM(price) FROM budget WHERE (date = '" + year + "-" + month + "-" + day
					+ "') and (in_out=" + i_o + ");";

			connection = DriverManager.getConnection(url, user, password);

			statement = connection.createStatement();

			resultSet = statement.executeQuery(queryString);

			resultSet.next();

			return_num = resultSet.getInt("sum(price)");
		} catch (SQLException e) {
			System.out.println("[���� ����]\n" + e.getStackTrace());
		} finally {
			closeDatabase();
			return return_num;
		}
	}
}
