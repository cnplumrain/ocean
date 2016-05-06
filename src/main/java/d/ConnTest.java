package d;
import java.sql.Connection;

public class ConnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnectionManager dcm = DBConnectionManager.getInstance();
		Connection conn = dcm.getConnection("jdbc");
		Connection conn2 = dcm.getConnection("jdbc");
		Connection conn3 = dcm.getConnection("db1");
		Connection conn4 = dcm.getConnection("db");
		String str = "db";
		Connection conn5 = DBConnectionManager.getInstance().getConnection(str);
		dcm.release();
		System.out.println(conn+":"+conn2+":"+conn3+":"+conn4+":"+conn5);
	}

}
