package com.luxprojects.onlineBook.Dtos;

import java.time.LocalDateTime;
import com.luxprojects.onlineBook.Entities.Library;
import com.luxprojects.onlineBook.Entities.OnlineReader;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class LibrarySubscribeRequestDTO {

	private Library library;
	private OnlineReader onlineReader;
	private String observation;
	private LocalDateTime suscribeAt;
	private LocalDateTime unSubscribeAt;
}
