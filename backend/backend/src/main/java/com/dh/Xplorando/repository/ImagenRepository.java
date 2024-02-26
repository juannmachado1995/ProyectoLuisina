package com.dh.Xplorando.repository;

import com.dh.Xplorando.entity.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepository extends JpaRepository<Imagen,Long> {
}
