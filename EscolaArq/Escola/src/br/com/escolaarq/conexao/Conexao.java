package br.com.escolaarq.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.escolaarq.arquivo.Arquivo;

public class Conexao {

	public static Connection abrirConexao() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/teste";
			
			//------------------
			String ArqConfig = "Conexao.con";
			
			String conteudo = Arquivo.Read(ArqConfig);
			String c1 = conteudo.split(";")[0];
			String c2 = conteudo.split(";")[1];
			//-------------------
			
			//"jdbc:mysql://localhost:3306/teste","root", "*123456HAS*"
			final String USER = c1;
			final String PASS = c2;
			
			con = DriverManager.getConnection(url, USER, PASS);
			System.out.println("Conexao aberta");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + "Erro no envio dos dados");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "Erro no envio dos dados");
		} catch (Exception e) {
			System.out.println(e.getMessage() + "Erro no envio dos dados");
		}
		return con;
	}

	public static void fecharConexao(Connection con) {
		try {
			con.close();
			System.out.println("Conexão fechada");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " Erro para fechar");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " Erro para fechar");
		}
	}

}
