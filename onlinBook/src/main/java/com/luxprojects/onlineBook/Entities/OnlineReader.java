package com.luxprojects.onlineBook.Entities;

import java.util.List;
import java.util.Set;

import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "OnlineReader")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString
public class OnlineReader extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String readerName;
	@Email
	private String readerEmail;
	private String readerPhone;
	@OneToMany
	private Set<Book> books;
	@OneToMany(mappedBy = "onlineReader")
    Set<LibrarySubscribes> librarySubscribes;
	@OneToMany
	private List<Category> categories;
}
