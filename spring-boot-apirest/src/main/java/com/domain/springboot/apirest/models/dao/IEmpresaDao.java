/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.domain.springboot.apirest.models.dao;

import com.domain.springboot.apirest.models.entity.Empresa;
import org.springframework.data.repository.CrudRepository;


public interface IEmpresaDao extends CrudRepository<Empresa, Long>{
    
}
