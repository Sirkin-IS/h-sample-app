package ru.crpt.edo.roaming.web.rest;

import ru.crpt.edo.roaming.domain.BadIncomingTransportPackage;
import ru.crpt.edo.roaming.repository.BadIncomingTransportPackageRepository;
import ru.crpt.edo.roaming.web.rest.errors.BadRequestAlertException;

import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link ru.crpt.edo.roaming.domain.BadIncomingTransportPackage}.
 */
@RestController
@RequestMapping("/api")
@Transactional
public class BadIncomingTransportPackageResource {

    private final Logger log = LoggerFactory.getLogger(BadIncomingTransportPackageResource.class);

    private static final String ENTITY_NAME = "sampleAppBadIncomingTransportPackage";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final BadIncomingTransportPackageRepository badIncomingTransportPackageRepository;

    public BadIncomingTransportPackageResource(BadIncomingTransportPackageRepository badIncomingTransportPackageRepository) {
        this.badIncomingTransportPackageRepository = badIncomingTransportPackageRepository;
    }

    /**
     * {@code POST  /bad-incoming-transport-packages} : Create a new badIncomingTransportPackage.
     *
     * @param badIncomingTransportPackage the badIncomingTransportPackage to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new badIncomingTransportPackage, or with status {@code 400 (Bad Request)} if the badIncomingTransportPackage has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/bad-incoming-transport-packages")
    public ResponseEntity<BadIncomingTransportPackage> createBadIncomingTransportPackage(@Valid @RequestBody BadIncomingTransportPackage badIncomingTransportPackage) throws URISyntaxException {
        log.debug("REST request to save BadIncomingTransportPackage : {}", badIncomingTransportPackage);
        if (badIncomingTransportPackage.getId() != null) {
            throw new BadRequestAlertException("A new badIncomingTransportPackage cannot already have an ID", ENTITY_NAME, "idexists");
        }
        BadIncomingTransportPackage result = badIncomingTransportPackageRepository.save(badIncomingTransportPackage);
        return ResponseEntity.created(new URI("/api/bad-incoming-transport-packages/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /bad-incoming-transport-packages} : Updates an existing badIncomingTransportPackage.
     *
     * @param badIncomingTransportPackage the badIncomingTransportPackage to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated badIncomingTransportPackage,
     * or with status {@code 400 (Bad Request)} if the badIncomingTransportPackage is not valid,
     * or with status {@code 500 (Internal Server Error)} if the badIncomingTransportPackage couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/bad-incoming-transport-packages")
    public ResponseEntity<BadIncomingTransportPackage> updateBadIncomingTransportPackage(@Valid @RequestBody BadIncomingTransportPackage badIncomingTransportPackage) throws URISyntaxException {
        log.debug("REST request to update BadIncomingTransportPackage : {}", badIncomingTransportPackage);
        if (badIncomingTransportPackage.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        BadIncomingTransportPackage result = badIncomingTransportPackageRepository.save(badIncomingTransportPackage);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, badIncomingTransportPackage.getId().toString()))
            .body(result);
    }

    /**
     * {@code GET  /bad-incoming-transport-packages} : get all the badIncomingTransportPackages.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of badIncomingTransportPackages in body.
     */
    @GetMapping("/bad-incoming-transport-packages")
    public List<BadIncomingTransportPackage> getAllBadIncomingTransportPackages() {
        log.debug("REST request to get all BadIncomingTransportPackages");
        return badIncomingTransportPackageRepository.findAll();
    }

    /**
     * {@code GET  /bad-incoming-transport-packages/:id} : get the "id" badIncomingTransportPackage.
     *
     * @param id the id of the badIncomingTransportPackage to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the badIncomingTransportPackage, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/bad-incoming-transport-packages/{id}")
    public ResponseEntity<BadIncomingTransportPackage> getBadIncomingTransportPackage(@PathVariable Long id) {
        log.debug("REST request to get BadIncomingTransportPackage : {}", id);
        Optional<BadIncomingTransportPackage> badIncomingTransportPackage = badIncomingTransportPackageRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(badIncomingTransportPackage);
    }

    /**
     * {@code DELETE  /bad-incoming-transport-packages/:id} : delete the "id" badIncomingTransportPackage.
     *
     * @param id the id of the badIncomingTransportPackage to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/bad-incoming-transport-packages/{id}")
    public ResponseEntity<Void> deleteBadIncomingTransportPackage(@PathVariable Long id) {
        log.debug("REST request to delete BadIncomingTransportPackage : {}", id);
        badIncomingTransportPackageRepository.deleteById(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, id.toString())).build();
    }
}
