package br.com.conexaobdum.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static void main(String[] args) throws SQLException{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				DriverManager.getConnection("jdbc:mysql://localhost/xe?useSSL=false", "root", "*123456HAS*");			
			} catch (ClassNotFoundException e) {
				throw new SQLException(e.getMessage());
			}
		
	}

}
