package com.luxprojects.onlineBook.model;

import java.time.LocalDateTime;

import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name="LibrarySubscriber")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class LibrarySubscribes extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="library_id")
	private Library library;
	
	@ManyToOne
	@JoinColumn(name="onlineReader_id")
	private OnlineReader onlineReader;
	
	private String observation;
	private LocalDateTime suscribeAt;
	private LocalDateTime unSubscribeAt;

}
