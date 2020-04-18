package com.hugo.com.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hugo.com.clientes.ProductoClienteRest;
import com.hugo.com.models.Item;

@Service
@Primary
public class ItemServiceFeign implements ItemService {
	@Autowired
	private ProductoClienteRest clienteFeign;
	
	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return clienteFeign.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		// TODO Auto-generated method stub
		return new Item(clienteFeign.detalle(id),cantidad);
	}

}
