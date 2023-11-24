package teste;

import java.io.IOException;
import java.sql.Connection;

import javax.swing.JOptionPane;

import arquivo.Arquivo;
import conexao.Conexao;
import dao.CepDAO;
import model.Endereco;
import service.ViacepService;

public class InserirTeste {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		
		ViacepService viacepservice = new ViacepService();
		
		Endereco enderecoBD = new Endereco();
		CepDAO cepdao = new CepDAO(con);
		
		

		try {
			//Endereco endereco = viacepservice.getEndereco("01538001");
			Endereco endereco = viacepservice.getEndereco(JOptionPane.showInputDialog("Digite o CEP"));
			
			String recebeCep = endereco.getCep();
			String recebeLogradouro = endereco.getLogradouro();
			String recebeComplemento = endereco.getComplemento();
			String recebeBairro = endereco.getBairro();
			String recebeLocalidade = endereco.getLocalidade();
			String recebeUf = endereco.getUf();
			String recebeIbge = endereco.getIbge();
			String recebeGia = endereco.getGia();
			String recebeDdd = endereco.getDdd();
			String recebeSiafi = endereco.getSiafi();
			
			enderecoBD.setCep(recebeCep);
			enderecoBD.setLogradouro(recebeLogradouro);
			enderecoBD.setComplemento(recebeComplemento);
			enderecoBD.setBairro(recebeBairro);
			enderecoBD.setLocalidade(recebeLocalidade);
			enderecoBD.setUf(recebeUf);
			enderecoBD.setIbge(recebeIbge);
			enderecoBD.setGia(recebeGia);
			enderecoBD.setDdd(recebeDdd);
			enderecoBD.setSiafi(recebeSiafi);
			

			String arq = "ArquivoCep.txt";
			
			
			String texto = "Os dados relacionados ao seu CEP são: \n" +
					recebeCep + "\n" +	
					recebeLogradouro + "\n" +
					recebeComplemento + "\n" +
					recebeBairro + "\n" +
					recebeLocalidade + "\n" +
					recebeUf + "\n" +
					recebeIbge + "\n" +
					recebeGia + "\n" +
					recebeDdd + "\n" +
					recebeSiafi + "\n"
					;
			
			if(Arquivo.Write(arq,texto))
				System.out.println("O arquivo foi salvo com sucesso.");
			else
				System.out.println("Ocorreu erro para salvar o arquivo.");
			
			System.out.println(cepdao.inserir(enderecoBD));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Conexao.fecharConexao(con);

	}

}
