package ru.crpt.edo.roaming.repository;

import ru.crpt.edo.roaming.domain.BadIncomingTransportPackage;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the BadIncomingTransportPackage entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BadIncomingTransportPackageRepository extends JpaRepository<BadIncomingTransportPackage, Long> {

}
