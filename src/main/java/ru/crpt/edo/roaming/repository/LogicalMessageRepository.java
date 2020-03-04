package ru.crpt.edo.roaming.repository;

import ru.crpt.edo.roaming.domain.LogicalMessage;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the LogicalMessage entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LogicalMessageRepository extends JpaRepository<LogicalMessage, Long> {

}
