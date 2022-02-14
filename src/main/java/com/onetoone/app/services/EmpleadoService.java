package com.onetoone.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetoone.app.dto.EmpleadoDTO;
import com.onetoone.app.models.DireccionModel;
import com.onetoone.app.models.EmpleadoModel;
import com.onetoone.app.repositories.DireccionRepository;
import com.onetoone.app.repositories.EmpleadoRepository;

@Service
public class EmpleadoService {

	
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Autowired
	DireccionRepository direccionRepository;
	
	public void save(EmpleadoDTO empleadoDTO) {
		
		DireccionModel direccionElegida = direccionRepository.getById(empleadoDTO.getIdDireccion());
		EmpleadoModel empleadoNuevo = new EmpleadoModel();
			empleadoNuevo.setApellidoMaterno(empleadoDTO.getApellidoMaterno());
			empleadoNuevo.setApellidoPaterno(empleadoDTO.getApellidoPaterno());
			empleadoNuevo.setNombres(empleadoDTO.getNombre());
			empleadoNuevo.setDireccion(direccionElegida);
		
			
		empleadoRepository.save(empleadoNuevo);
	}
	
	
}
