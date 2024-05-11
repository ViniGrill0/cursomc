package com.vinigrillo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinigrillo.cursomc.domain.ItemPedido;
import com.vinigrillo.cursomc.domain.ItemPedidoPK;


@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK>{

	
}
