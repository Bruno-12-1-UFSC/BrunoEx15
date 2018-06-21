
public class Ocorrencia {

	private static long ULTIMA_CHAVE = 0L;
	
	public enum Tipo { TAREFA, BUG, MELHORIA }
	public enum Prioridade { ALTA, MEDIA, BAIXA }
	
	private long chave;
	private String resumo;
	private Tipo tipo;
	private Funcionario responsavel;
	private boolean aberta;
	private Prioridade prioridade;
	
	public Ocorrencia(String resumo, Tipo tipo, Funcionario responsavel, Prioridade prioridade) {
		this.chave = ULTIMA_CHAVE++;
		this.resumo = resumo;
		this.tipo = tipo;
		this.responsavel = responsavel;
		this.aberta = true;
		this.prioridade = prioridade;
	}

	boolean aberta() { return aberta; }
}
