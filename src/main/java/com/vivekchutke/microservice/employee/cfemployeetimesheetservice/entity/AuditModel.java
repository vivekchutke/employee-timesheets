package com.vivekchutke.microservice.employee.cfemployeetimesheetservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class) //In the above class, we’re using Spring Boot’s AuditingEntityListener to automatically populate the createdAt and updatedAt fields.
@JsonIgnoreProperties(value = {"created", "updated"}, allowGetters = true)
public abstract class AuditModel implements Serializable  {

    @CreatedDate
    @Column(name="created", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP) //@Temporal annotation solves the one of the major issue of converting the date and time values from Java object to compatible database type and retrieving back to the application.
    private Date created;

    @LastModifiedDate
    @Column(name = "updated", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;


    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
