
public class Aluno {
	
	public String nome;
	public String RA;
	public String curso;
 	public int idade;
	public String turno;
	public String sexo;
	
	
	public Aluno(String nome, String rA, String curso, int idade, String turno, String sexo){
		this.nome = nome;
		this.RA = rA;
		this.curso = curso;
		this.idade = idade;
		this.sexo = sexo;
		this.turno = turno;
		
		}
	public String imprimirAluno(){
		return  "Dados do Aluno\n" +
				"Nome: " + getNome() + "\n" +
				"RA: " + getRA() + "\n" +
				"Curso: " + getCurso() + "\n" +
				"Idade: " + getIdade() + "\n" +
				"Sexo " + getSexo() + "\n" +
				"Turno: " + getSexo();
				}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


}
