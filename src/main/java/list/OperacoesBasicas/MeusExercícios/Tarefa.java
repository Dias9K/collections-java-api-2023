package main.java.list.OperacoesBasicas.MeusExercícios;

public class Tarefa {
    // atributo
    private String descricao;

    // getter
    public String getDescricao() {
        return descricao;
    }

    // construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
        
}