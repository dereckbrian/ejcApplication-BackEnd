package com.saosebastiao.escontroEJC.repository;

import com.saosebastiao.escontroEJC.entity.Recados;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecadoRepository extends JpaRepository<Recados, Long> {
    List<Recados> findTop6ByOrderByIdDesc();
}
