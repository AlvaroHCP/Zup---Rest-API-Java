import java.util.Scanner;
import java.lang.Class;

public class ResTfulApi{

public class pessoas {
//declarando os atributos
private String nome;
private String email;
private Long cpf;
private String data;

//definindo o construtor
public pessoas(String nome, String email, Long cpf, String data){
this.nome=nome;
this.email=email;
this.cpf=cpf;
this.data=data;
if(nome.length==0||email.length==0||cpf.length==0||data.length==0) System.out.println("Insira todos os campos obrigatórios de cadastro de usuário.");
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
public void setIdade(String data){
this.data=data;
}
public void setEmail(String email){
this.email=email;
}
public void setCpf(Long Cpf){
this.cpf=cpf;
}

}

public static void main(String args[]){

pessoas pessoa1 = new pessoas();
pessoa1.setNome("nfkddjssnj");
pessoa1.setData(25/10/2004);
System.out.println(pessoa1.nome + "      " + pessoa1.data);
} 
}
