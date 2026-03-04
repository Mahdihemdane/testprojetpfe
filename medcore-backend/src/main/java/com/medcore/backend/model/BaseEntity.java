package com.medcore.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

@MappedSuperclass
@FilterDef(
        name = "tenantFilter",
        parameters = @ParamDef(name = "establishmentId", type = String.class)
)
@Filter(
        name = "tenantFilter",
        condition = "establishment_id = :establishmentId"
)
public abstract class BaseEntity {

    @Column(name = "establishment_id", nullable = false)
    private String establishmentId;

    public String getEstablishmentId() {
        return establishmentId;
    }

    public void setEstablishmentId(String establishmentId) {
        this.establishmentId = establishmentId;
    }
}
