package com.ramaka.rgm.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramaka.rgm.models.PedidosModel;

@Repository
public interface PedidosRepository extends JpaRepository<PedidosModel, Long>{
		public abstract ArrayList<PedidosModel>findById(Integer folio_pedidos);

}
