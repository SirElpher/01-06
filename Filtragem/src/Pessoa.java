import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private int idade;
	
	public static ArrayList<Pessoa> dados = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
