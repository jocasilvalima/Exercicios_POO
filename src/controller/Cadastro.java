package controller;

import model.Aluno;
import model.Professor;

public class Cadastro {
    public static void main(String[] args) {
        Professor p1 = new Professor("Joaquim Silva", "123456", "123.456.789-23","(21)98034-3454", "jo@email.com", "P123", "TI");
		
		Aluno a1 = new Aluno("Victoria Lima", "34657", "098.765.432-78", "(21)97032-7890","vic@email.com","A123", "BackEnd");
		
		System.out.println(p1.toString());
		System.out.println(a1.toString());
		
	}
	
}

    
