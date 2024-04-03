package org.example.repositories;

import org.example.Domain.transation.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionalRepository extends JpaRepository<Transaction, Long> {
}
