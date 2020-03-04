package ru.crpt.edo.roaming.repository;

import ru.crpt.edo.roaming.domain.DocumentHistory;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the DocumentHistory entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DocumentHistoryRepository extends JpaRepository<DocumentHistory, Long> {

}
