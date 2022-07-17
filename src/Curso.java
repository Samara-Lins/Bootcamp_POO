
public class Curso {
	private String titulo;
	private String descricao;
	private int cargaHoraria;
	
	public Curso() {}

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

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public void imprimir(Curso curso) {
		System.out.println("Curso: "+curso.getTitulo());
		System.out.println("Descrição: "+curso.getDescricao());
		System.out.println("Carga horária: "+curso.getCargaHoraria()+" horas\n");
	}
	
	public int calcularXP() {
		return
	}
}
