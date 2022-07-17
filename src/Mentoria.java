import java.time.LocalDate;

public class Mentoria {
	private String titulo;
	private String descricao;
	private LocalDate data;
	
	public Mentoria() {}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void imprimir(Mentoria mentoria) {
		System.out.println("Mentoria: "+mentoria.getTitulo());
		System.out.println("Descrição: "+mentoria.getDescricao());
		System.out.println("Data: "+mentoria.getData()+"\n");
	}
	
	public int calcularXP() {
		
	}
}
