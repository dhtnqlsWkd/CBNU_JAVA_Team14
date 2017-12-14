package Database;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		JDBCExam jdbcExam = new JDBCExam();
		Data a, b;
//		jdbcExam.productInsert(new Data("2017-12-12",50000,0,0,1,""));
		a = jdbcExam.productSelectOne("2017-12-14", 1);
		b = jdbcExam.productSelectOne("2017-12-06", 1);
		System.out.println(a.get_str());
		System.out.println(b.get_str());
//		jdbcExam.productUpdate(a, b);
		// jdbcExam.productSelectOne("2017-12-13",2);
		// Version ver = new Version();
		// ver.versionupdate(0);
	}
}