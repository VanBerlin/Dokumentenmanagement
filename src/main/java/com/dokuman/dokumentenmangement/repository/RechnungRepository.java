package com.dokuman.dokumentenmangement.repository;

import com.dokuman.dokumentenmangement.model.Rechnung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RechnungRepository extends JpaRepository<Rechnung, Long> {
}
