/**
 * 
 */
package com.devpredator.practicaspringjsf.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.devpredator.practicaspringjsf.dao.RestauranteDAO;
import com.devpredator.practicaspringjsf.entity.Restaurante;

/**
 * @author DevPredator
 *
 */
@Repository
public class RestauranteDAOImpl implements RestauranteDAO {

	//AGREGAR AQUI EL ENTITY MANAGER FACTORY.
	
	@Override
	public List<Restaurante> consultar() {
		//AGREGAR LA FUNCIONALIDAD PARA CONSULTAR LOS RESTAURANTES CON JPA.
		return null;
	}

}
