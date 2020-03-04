package ru.crpt.edo.roaming;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("ru.crpt.edo.roaming");

        noClasses()
            .that()
                .resideInAnyPackage("ru.crpt.edo.roaming.service..")
            .or()
                .resideInAnyPackage("ru.crpt.edo.roaming.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..ru.crpt.edo.roaming.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}
