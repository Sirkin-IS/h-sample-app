package ru.crpt.edo.roaming.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A BadIncomingTransportPackage.
 */
@Entity
@Table(name = "bad_incoming_transport_package")
public class BadIncomingTransportPackage implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "transport_package_id", nullable = false)
    private Integer transportPackageId;

    @NotNull
    @Column(name = "created_at", nullable = false)
    private LocalDate createdAt;

    
    @Lob
    @Column(name = "content", nullable = false)
    private byte[] content;

    @Column(name = "content_content_type", nullable = false)
    private String contentContentType;

    @NotNull
    @Column(name = "answer_code", nullable = false)
    private Integer answerCode;

    @OneToOne
    @JoinColumn(unique = true)
    private TransportPackage transportPackageId;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTransportPackageId() {
        return transportPackageId;
    }

    public BadIncomingTransportPackage transportPackageId(Integer transportPackageId) {
        this.transportPackageId = transportPackageId;
        return this;
    }

    public void setTransportPackageId(Integer transportPackageId) {
        this.transportPackageId = transportPackageId;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public BadIncomingTransportPackage createdAt(LocalDate createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public byte[] getContent() {
        return content;
    }

    public BadIncomingTransportPackage content(byte[] content) {
        this.content = content;
        return this;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getContentContentType() {
        return contentContentType;
    }

    public BadIncomingTransportPackage contentContentType(String contentContentType) {
        this.contentContentType = contentContentType;
        return this;
    }

    public void setContentContentType(String contentContentType) {
        this.contentContentType = contentContentType;
    }

    public Integer getAnswerCode() {
        return answerCode;
    }

    public BadIncomingTransportPackage answerCode(Integer answerCode) {
        this.answerCode = answerCode;
        return this;
    }

    public void setAnswerCode(Integer answerCode) {
        this.answerCode = answerCode;
    }

    public TransportPackage getTransportPackageId() {
        return transportPackageId;
    }

    public BadIncomingTransportPackage transportPackageId(TransportPackage transportPackage) {
        this.transportPackageId = transportPackage;
        return this;
    }

    public void setTransportPackageId(TransportPackage transportPackage) {
        this.transportPackageId = transportPackage;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BadIncomingTransportPackage)) {
            return false;
        }
        return id != null && id.equals(((BadIncomingTransportPackage) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "BadIncomingTransportPackage{" +
            "id=" + getId() +
            ", transportPackageId=" + getTransportPackageId() +
            ", createdAt='" + getCreatedAt() + "'" +
            ", content='" + getContent() + "'" +
            ", contentContentType='" + getContentContentType() + "'" +
            ", answerCode=" + getAnswerCode() +
            "}";
    }
}
