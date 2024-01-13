package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {

	private static String databaseUrl = "jdbc:mysql://localhost:3306/codefios";
	private static String databasUserName = "root";
	private static String databasUserPassword = "rootroot";

	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String stringColumbValue;
	private static long longColumbValue;

	public static String getStringDataFromDatabase(String tableName, String columnName) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(databaseUrl, databasUserName, databasUserPassword);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from " + tableName + ";");
			while (resultSet.next()) {
				stringColumbValue = resultSet.getNString(columnName);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return stringColumbValue;
	}

	public static Long getLongDataFromDatabase(String tableName, String columnName) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(databaseUrl, databasUserName, databasUserPassword);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from " + tableName + ";");

			while (resultSet.next()) {
				longColumbValue = resultSet.getLong(columnName);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return longColumbValue;
	}


}
