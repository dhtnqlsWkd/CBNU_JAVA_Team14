package Database;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		JDBCExam jdbcExam = new JDBCExam();
//		Data a = new Data(2017,12,8,80000,1,0,6,"gogi");
//		Data b = new Data(2017,12,9,50000,1,1,2,"bab");
//		Data c = new Data(2017,12,4,20000,1,0,6,"kimchi");

		jdbcExam.productSelectOne("2017-12-13");
	}
}