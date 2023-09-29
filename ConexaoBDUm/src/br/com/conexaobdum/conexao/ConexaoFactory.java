package br.com.conexaobdum.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static void main(String[] args){
		

			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conexao = null;
				String url = "jdbc:mysql://localhost/xe?useSSL=false";
				conexao = DriverManager.getConnection(url, "root", "*123456HAS*");
				System.out.println("Funcionou");
			
			} catch (ClassNotFoundException e) {
				throw new SQLException(e.getMessage());
			}
		
	}

}
