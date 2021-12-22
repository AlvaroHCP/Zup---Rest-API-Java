package com.example.demo;

import java.util.Scanner;
import java.lang.Class;

public class RESTfulApi{

public class Pessoas {
//declarando os atributos
private String nome;
private String email;
private Long cpf;
private String data;

//definindo o construtor
public void pessoas(String nome, String email, Long cpf, String data){
this.nome=nome;
this.email=email;
this.cpf=cpf;
this.data=data;
if(nome==null||email==null||cpf==null||data==null) System.out.println("Insira todos os campos obrigatórios de cadastro de usuário.");
}

//definindo os métodos da classe
public String getNome(){
return nome;
}
public String getData(){
	return Data;
}
public String getEmail(){
return email;
}
public Long getCpf(){
return cpf;
}
public void setNome(String nome){
this.nome=nome;
}
public void setData(String data){
this.data=data;
}
public void setEmail(String email){
this.email=email;
}
public void setCpf(Long Cpf){
this.cpf=cpf;
}

}



//criando a url de login para comunicação com o servidor da Marvel
	Public class url {
		String publicKey = "NUMERO_CHAVE_PUBLICA"; //colocar a minha chave pública

		String privateKey = "NUMERO_CHAVE_PRIVADA"; //colocar a minha chave privada


		Long currentTime = DateTimeUtils.currentTimeMillis(); //criando um tempo em milisegundos

		byte[] hash = org.apache.commons.codec.digest.DigestUtils.md5(currentTime + privateKey + publicKey); //criando o padrão m5 de hash

		String result = new String(Hex.encodeHex(hash)); //criando a parte de login da URL

		Client client = ClientBuilder.newClient();		
		String varcomics = "http://gateway.marvel.com:443/v1/public/comics";  //conectando na parte Comics do servidor da URL
		WebTarget baseTarget = client.target("http://gateway.marvel.com:443/v1/public/comics")
				.queryParam("ts", currentTime).queryParam("apikey", publicKey).queryParam("hash", result); //definindo a URL completa para acessar o conteúdo
               
	}

public class itenscomics {
        itenscomics (){

return 
}
}

public void comics {
private String ComicId
private String Titulo
private Double Preco
private String Autores
private String ISBN
private String Descricao

public comics (String ComicId, String Titulo, Double Preco, String Autores, String ISBN, String Descricao)
this.ComicId=ComicId;
this.Titulo=Titulo;
This.Preco=Preco;
this.Autores=Autores;
this.ISBN=ISBN;
this.Descricao=Descricao;
if(ComicId.length==0||Titulo.length==0||Preco.length==0||Autores.length==0||ISBN.length==0||Descricao.length==0) System.out.println("Insira todos os campos obrigatórios de cadastro de usuário.")
}






public static void main(String[] args){

pessoas pessoa1 = new pessoas();
pessoa1.setNome("nfkddjssnj");
pessoa1.setData(25/10/2004);
System.out.println(pessoa1.nome + "      " + pessoa1.data);
} 
}
