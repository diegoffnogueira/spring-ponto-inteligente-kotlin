package com.diego.pontoInteligente.documents

import com.diego.pontoInteligente.enums.PerfilEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Funcionario(
     val name: String,
     val email: String,
     val password: String,
     val cpf: String,
     val perfil: PerfilEnum,
     val empresaId: String,
     val valorHora: Double? = 0.0,
     val qtdHorasTrabalhoDia: Float? = 0.0f,
     val qtdHorasAlmoco: Float? = 0.0f,
     @Id val id: String? = null
)