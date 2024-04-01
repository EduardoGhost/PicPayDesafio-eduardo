package org.example.repositories;

import org.example.Domain.transation.Transation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionalRepository extends JpaRepository<Transation, Long> {
}
