package com.example.todo_android.model

data class Categoria (
    var id: Long,
    var descricao: String?,
    var tarefas: List<Tarefa>?

    ){

    override fun toString(): String {
        return descricao!!
    }

}