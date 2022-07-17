
public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("POO");
		curso1.setDescricao("Introdução à programação"
				+ " orientada a objetos.");
		curso1.setCargaHoraria(6);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Java");
		curso2.setDescricao("Instrodução à linguagem Java");
		curso2.setCargaHoraria(4);
		
		curso1.imprimir(curso1);
		curso2.imprimir(curso2);
	}
}
