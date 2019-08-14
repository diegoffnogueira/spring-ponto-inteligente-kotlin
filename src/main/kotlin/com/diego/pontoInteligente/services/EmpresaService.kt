package com.diego.pontoInteligente.services

import com.diego.pontoInteligente.documents.Empresa

interface EmpresaService {

    fun findByCnpj(cnpj: String): Empresa?

    fun persist(empresa: Empresa): Empresa

}