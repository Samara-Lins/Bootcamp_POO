
public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("POO");
		curso1.setDescricao("Introdu��o � programa��o"
				+ " orientada a objetos.");
		curso1.setCargaHoraria(6);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Java");
		curso2.setDescricao("Instrodu��o � linguagem Java");
		curso2.setCargaHoraria(4);
		
		curso1.imprimir(curso1);
		curso2.imprimir(curso2);
	}
}
