package model;

public class Aluno extends Pessoa {
   
    private String matricula, curso;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String rg, String cpf, String telefone, String email, String matricula, String curso) {
		super(nome, rg, cpf, telefone, email);
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		System.out.println("Imprimindo Aluno");
		return super.toString() + "\nMatricula:" + matricula + 
				"\nCurso:" + curso +"\n";


}
}

