package com.example.todo_android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todo_android.adapter.TarefaAdapter
import com.example.todo_android.databinding.FragmentListBinding
import com.example.todo_android.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        mainViewModel.listTarefa()


        val adapter = TarefaAdapter()

        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)



        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        mainViewModel.myTarefaResponse.observe(viewLifecycleOwner){
            response -> if(response.body() != null){
                adapter.setList(response.body()!!)
            }
        }

        return binding.root
    }
}


// adapter.setList(listTarefas)

/* val listTarefas = listOf(
      Tarefa(
          "Lavar a louça",
          "Lavar a louça do dia todo",
          "Wesley",
          "2022-09-26",
          false,
          "Dia a Dia"
      ),

      Tarefa(
          "Estudar inglês",
          "Consumir conteúdos em inglês",
          "Wesley",
          "2022-09-26",
          false,
          "Estudos"
      ),

      Tarefa(
          "Médico",
          "Consulta com clínico",
          "Wesley",
          "2022-09-26",
          false,
          "Saúde"
      )
  )*/
