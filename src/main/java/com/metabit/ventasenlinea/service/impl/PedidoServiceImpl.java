package com.metabit.ventasenlinea.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.metabit.ventasenlinea.entity.Cliente;
import com.metabit.ventasenlinea.entity.Estado;
import com.metabit.ventasenlinea.entity.Pedido;
import com.metabit.ventasenlinea.repository.PedidoJpaRepository;
import com.metabit.ventasenlinea.service.PedidoService;

@Service("pedidoServiceImpl")
public class PedidoServiceImpl implements PedidoService{
	
	@Autowired
	@Qualifier("pedidoJpaRepository")
	private PedidoJpaRepository pedidoJpaRepository;

	@Override
	public List<Pedido> getAllPedidosCliente(Cliente id_cliente) {
		return pedidoJpaRepository.findByCliente(id_cliente);
	}

	@Override
	public List<Pedido> getAllPedidosEmploye(Estado id_estado) {
		return pedidoJpaRepository.findByEstado(id_estado);
	}

	@Override
	public List<Pedido> getAll() {
		return pedidoJpaRepository.findAll();
	}

	@Override
	public Pedido getPedido(int id_pedido) {
		return pedidoJpaRepository.findByIdPedido(id_pedido);
	}
	
	

}
