
public class Disciplina {
        
		public String nome;
		public String curso;
		public String turma;
		public int CH;
		
		
		public Disciplina(String nome, String curso, String turma, int CH ){
			this.curso = curso;
			this.nome = nome;
			this.turma = turma;
			this.CH = CH;
					
		}
		public String imprimirDisciplina(){
			return  "Dados da Disciplina\n" +
					"Nome: " + getNome() + "\n" +
					"RA: " + getCurso() + "\n" +
					"Curso: " + getTurma() + "\n" +
					"Idade: " + getCH();
					}
		
		public String getTurma() {
			return curso;
		}
		public void setTurma(String turma) {
			this.curso = turma;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCurso() {
			return curso;
		}
		public void setTurno(String curso) {
			this.curso = curso;
		}
		public int getCH() {
			return CH;
		}
		public void setCH(int cH) {
			CH = cH;
		}
	//teste

}
