package ru.crpt.edo.roaming.repository;

import ru.crpt.edo.roaming.domain.Operators;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Operators entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OperatorsRepository extends JpaRepository<Operators, Long> {

}
