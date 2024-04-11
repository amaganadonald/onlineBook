package com.luxprojects.onlineBook.Entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	@CreationTimestamp(source = SourceType.DB)
	@Column(insertable = false, updatable = false)
	private LocalDateTime created;
	@CreatedBy
	private String createdBy;
	@LastModifiedBy
	private String lastModifieldBy;
	@UpdateTimestamp(source = SourceType.DB)
	private LocalDateTime lastModifieldDate;

}
