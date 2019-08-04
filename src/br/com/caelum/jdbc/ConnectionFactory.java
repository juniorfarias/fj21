package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/fj21", "root", "root");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
