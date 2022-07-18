
public class Curso extends Conteudo {
	private String titulo;
	private String descricao;
	private int cargaHoraria;
	
	public Curso() {}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public void imprimir(Curso curso) {
		System.out.println("Curso: "+curso.getTitulo());
		System.out.println("Descri��o: "+curso.getDescricao());
		System.out.println("Carga hor�ria: "+curso.getCargaHoraria()+" horas\n");
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO + 30d;
	}
}
