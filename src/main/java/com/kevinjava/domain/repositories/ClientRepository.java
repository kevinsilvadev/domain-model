package com.kevinjava.domain.repositories;

import com.kevinjava.domain.enities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
