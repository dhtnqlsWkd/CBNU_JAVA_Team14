package Database;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		JDBCExam jdbcExam = new JDBCExam();
		Data a, b;
		jdbcExam.productInsert(new Data("2017-11-12",8000,1,1,1,""));
//		a = jdbcExam.productSelectOne("2017-12-14", 1);
//		b = jdbcExam.productSelectOne("2017-12-04", 1);
//		jdbcExam.productUpdate(a, b);
		// jdbcExam.productSelectOne("2017-12-13",2);
		// Version ver = new Version();
		// ver.versionupdate(0);
	}
}