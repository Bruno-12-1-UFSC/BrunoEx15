import java.util.List;
import java.util.ArrayList;

public class Funcionario {

	private static long ULTIMO_ID = 0L;
	
	private long id;
	private String nome;
	
	private List<Ocorrencia> ocorrencias;
	
	public Funcionario(String nome) {
		this.id = ULTIMO_ID++;
		this.nome = nome;
		this.ocorrencias = new ArrayList<Ocorrencia>();
	}

	public long id() { return id; }
	public String nome() { return nome; }

	public List<Ocorrencia> ocorrencias() { return ocorrencias; }
	
	public void adicionarOcorrencia(Ocorrencia o) throws Exception {
		if (numeroDeOcorrenciasAbertas() < 10)
			ocorrencias.add(o);
		else
			throw new Exception();
	}

	public void removerOcorrencia(Ocorrencia o) { ocorrencias.remove(o); }
	
	private int numeroDeOcorrenciasAbertas() {
		int s = 0;
		for (Ocorrencia o : ocorrencias)
			if (o.aberta()) s++;
		return s;
	}

}
