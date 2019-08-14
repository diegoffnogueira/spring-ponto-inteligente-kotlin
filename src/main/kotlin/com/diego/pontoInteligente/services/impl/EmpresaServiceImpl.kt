package com.diego.pontoInteligente.services.impl

import com.diego.pontoInteligente.documents.Empresa
import com.diego.pontoInteligente.repositories.EmpresaRepository
import com.diego.pontoInteligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun findByCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persist(empresa: Empresa): Empresa = empresaRepository.save(empresa)
}