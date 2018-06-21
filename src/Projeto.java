import java.util.ArrayList;
import java.util.List;

public class Projeto {

	private String nome;
	
	private List<Ocorrencia> ocorrencias;
	
	public Projeto(String nome) {
		this.nome = nome;
		this.ocorrencias = new ArrayList<Ocorrencia>();
	}

	public List<Ocorrencia> ocorrencias() { return ocorrencias; }
	
	public void adicionarOcorrencia(Ocorrencia o) { ocorrencias.add(o); }
	
}
