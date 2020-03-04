package ru.crpt.edo.roaming.repository;

import ru.crpt.edo.roaming.domain.DocumentStatus;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the DocumentStatus entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DocumentStatusRepository extends JpaRepository<DocumentStatus, Long> {

}
