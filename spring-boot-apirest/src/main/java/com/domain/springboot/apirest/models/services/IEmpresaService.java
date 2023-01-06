/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.domain.springboot.apirest.models.services;

import com.domain.springboot.apirest.models.entity.Empresa;
import java.util.List;

/**
 *
 * @author carlo
 */
public interface IEmpresaService {

    public List<Empresa> ListarEmpresas();

    public Empresa encontrarEmpresaPorId(Long id);

    public Empresa guardarEmpresa(Empresa empresa);

    public void eliminarEmpresa(Long id);
}
