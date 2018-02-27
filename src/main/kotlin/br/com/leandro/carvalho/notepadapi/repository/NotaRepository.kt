package br.com.leandro.carvalho.notepadapi.repository

import br.com.leandro.carvalho.notepadapi.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.stream.Stream

@Repository

interface NotaRepository : MongoRepository<Nota, String> {
    @Query("{}")
    fun all(): Stream<Nota>

    fun findByTitulo(titulo: String): Nota

}