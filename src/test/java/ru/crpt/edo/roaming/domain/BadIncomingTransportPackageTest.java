package ru.crpt.edo.roaming.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import ru.crpt.edo.roaming.web.rest.TestUtil;

public class BadIncomingTransportPackageTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(BadIncomingTransportPackage.class);
        BadIncomingTransportPackage badIncomingTransportPackage1 = new BadIncomingTransportPackage();
        badIncomingTransportPackage1.setId(1L);
        BadIncomingTransportPackage badIncomingTransportPackage2 = new BadIncomingTransportPackage();
        badIncomingTransportPackage2.setId(badIncomingTransportPackage1.getId());
        assertThat(badIncomingTransportPackage1).isEqualTo(badIncomingTransportPackage2);
        badIncomingTransportPackage2.setId(2L);
        assertThat(badIncomingTransportPackage1).isNotEqualTo(badIncomingTransportPackage2);
        badIncomingTransportPackage1.setId(null);
        assertThat(badIncomingTransportPackage1).isNotEqualTo(badIncomingTransportPackage2);
    }
}
