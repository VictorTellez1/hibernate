package com.hibernate.hibernate.repository;

import com.hibernate.hibernate.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota,Long> {
}
