package com.metabit.ventasenlinea.service;

import java.util.List;

import com.metabit.ventasenlinea.entity.Cliente;
import com.metabit.ventasenlinea.entity.Estado;
import com.metabit.ventasenlinea.entity.Pedido;

public interface PedidoService {
	
	public List<Pedido> getAllPedidosCliente(Cliente id_cliente);
	
	public List<Pedido> getAllPedidosEmploye(Estado id_estado);
	
	public List<Pedido> getAll();
}
