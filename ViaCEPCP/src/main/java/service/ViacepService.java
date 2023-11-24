package service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import model.Endereco;

public class ViacepService {
	
	public Endereco getEndereco(String cep) throws ClientProtocolException, IOException {
		
		Endereco endereco = null;
		
		HttpGet request = new HttpGet("https://viacep.com.br/ws/"+cep+"/json/");
		
		try(CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
				
				CloseableHttpResponse response = httpClient.execute(request)) {
			
			HttpEntity entity = response.getEntity();
			
			if(entity != null) {
				
				String result = EntityUtils.toString(entity);
				
				Gson gson = new Gson();
				
				endereco = gson.fromJson(result, Endereco.class);
			}
		}
		
		return endereco;
	}
}


