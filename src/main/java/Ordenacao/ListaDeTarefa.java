package src.main.java.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefa {
    private List<Tarefa> tarefaList;

    public ListaDeTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaDeTarefa listaTarefa = new ListaDeTarefa();
        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Teste 2");

        System.out.println(listaTarefa.obterNumeroTotalTarefas());
    }
}

