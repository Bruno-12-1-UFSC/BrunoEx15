
public class Funcionario {

	private static long ULTIMO_ID = 0L;
	
	private long id;
	private String nome;
	
	public Funcionario(String nome) {
		this.id = ULTIMO_ID++;
		this.nome = nome;
	}

	public long id() { return id; }
	public String nome() { return nome; }
}
