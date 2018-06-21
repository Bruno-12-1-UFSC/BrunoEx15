import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String cnpj;
	private String nome;
	
	private List<Funcionario> funcionarios;
	private List<Projeto> projetos;

	public Empresa(String cnpj, String nome) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.funcionarios = new ArrayList<Funcionario>();
		this.projetos = new ArrayList<Projeto>();
	}

	public String cnpj() { return cnpj; }
	public String nome() { return nome; }

	public List<Funcionario> funcionarios() { return funcionarios; }
	public List<Projeto> projetos() { return projetos; }

	public void adicionarFuncionario(Funcionario f) { funcionarios.add(f); }
	public void adicionarProjeto(Projeto p) { projetos.add(p); }

	public void demitirFuncionario(Funcionario f) { funcionarios.remove(f); }
	public void cancelarProjeto(Projeto p) { projetos.remove(p); }

	
}
