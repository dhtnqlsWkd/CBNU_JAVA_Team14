package Database;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		JDBCExam jdbcExam = new JDBCExam();
		jdbcExam.productInsert("2017-12-30", 9000, 1, 2);
	}
}
