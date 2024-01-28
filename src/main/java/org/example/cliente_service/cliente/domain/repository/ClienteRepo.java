package org.example.cliente_service.cliente.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface ClienteRepo<T, ID> extends JpaRepository<T, ID> {

    public List<T> buscarTodos();
    public void eliminarPorIdentificacion(int identificacion);
    public T buscarPorIdentificacion(int identificacion);
}
