package com.hugo.com.models.service;

import java.util.List;

import com.hugo.com.models.Item;

public interface ItemService {
		
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);

}
