
public class Principal {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Juao", "21550575", "Ciencia da Computação", 21, "Masculino", "Norturno");		
		Disciplina d1 = new Disciplina("LTP-1", "Ciencia da Computação", "B", 37);
		
			System.out.println(a1.imprimirAluno() + "\n" + "-----------//----------\n" + d1.imprimirDisciplina());
	
	}
			


}
