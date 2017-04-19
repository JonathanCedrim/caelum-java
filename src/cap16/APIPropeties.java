package cap16;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class APIPropeties {

	public static void main(String[] args) throws SQLException {

		// exemplo
		Properties config = new Properties();

		config.setProperty("database.login", "jonathan");
		config.setProperty("database.url", "path");
		config.setProperty("database.url", "jdbc:mysql/lcoalhost/teste");
		// ....

		String login = config.getProperty("database.login");
		String password = config.getProperty("database.password");
		String url = config.getProperty("database");

		DriverManager.getConnection(url, login, password);

	}
}
