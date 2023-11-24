package teste;

import java.io.IOException;

import javax.swing.JOptionPane;

import model.Endereco;
import service.ViacepService;

public class Teste {

	public static void main(String[] args) {

		ViacepService viacepservice = new ViacepService();

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
			
			System.out.println("Os dados relacionados ao seu CEP são: \n" +
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
					);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}



