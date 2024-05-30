import java.util.List;

//@Data
/*
 * O Lombok ainda disponibiliza a anotação @Data 
 * que é a junção das anotações @Getter , @Setter , @EqualsAndHashCode e @ToString . 
 * esse é o resultado final de nossa classe utilizando as anotações do Lombok para evitar 
 * uso de código "boilerplate".
 */
public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
