package com.igortullio.stj.recrutamento.repository;

import com.igortullio.stj.recrutamento.domain.Ministro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinistroRepository extends JpaRepository<Ministro, Integer> {
}
