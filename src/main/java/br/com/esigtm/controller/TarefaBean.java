package br.com.esigtm.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.esigtm.model.Tarefa;

@Named
@SessionScoped
public class TarefaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Tarefa tarefa;

    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public String addTarefa() {
        tarefas.add(tarefa);
        System.out.println("Tarefa " + tarefa.getTitulo() + " adicionada com sucesso!");
        clean();
        return null;
    }

    private void clean() {
        this.tarefa = new Tarefa();
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}