package kucunguanli;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.eclipse.swt.widgets.Shell;

import com.mysql.jdbc.Driver;

public class JDBC_test {

	protected Shell shell;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {

		Driver driver = new Driver();
		String url = "jdbc:mysql://localhost:3306/mysql_tseh";
		Properties info = new Properties();
		info.put("user", "tseh");
		info.put("password", "tseh060509");
		Connection conn = driver.connect(url, info);
		System.out.println(conn);
	}

	/**
	 * Open the window.
	 */
/*	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}*/

	/**
	 * Create contents of the window.
	 */
/*	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");

	}*/

}
