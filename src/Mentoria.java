import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;
	
	public Mentoria() {}

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
	
	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}
}
