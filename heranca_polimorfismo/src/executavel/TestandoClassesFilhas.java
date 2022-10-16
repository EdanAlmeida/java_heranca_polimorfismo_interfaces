package executavel;

import classes.Aluno;
import classes.Diretor;
import classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Edan");
		aluno1.setIdade(16);
		
		Diretor diretor1 = new Diretor();
		diretor1.setNome("Cesar");
		diretor1.setIdade(50);
		
		Secretario secretario1 = new Secretario();
		secretario1.setNome("Maria");
		secretario1.setIdade(27);
		
		System.out.println("Aluno: " + aluno1);
		System.out.println("Diretor: " + diretor1);
		System.out.println("Secretario: " + secretario1);
		
		System.out.println(aluno1.pessoaMaiorIdade() + " " + aluno1.msgMaiorIdade());
		System.out.println(diretor1.pessoaMaiorIdade());
		System.out.println(secretario1.pessoaMaiorIdade());
		
	}
}
