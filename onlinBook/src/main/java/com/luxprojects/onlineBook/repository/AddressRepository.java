package com.luxprojects.onlineBook.repository;


/*import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;*/
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.luxprojects.onlineBook.model.Address;

public interface AddressRepository extends ReactiveCrudRepository<Address, Long>{
	
	/*@Query(value="SELECT a FROM Address a")
	Page<Address> findAllAddresPage(Pageable pageable);

	@Query("SELECT a FROM Address a where a.addressName = ?1")
	Address findAddressByName(String name);
	
	@Query(value="SELECT a FROM Address a where a.addressCity = :city", nativeQuery=true)
	List<Address> findAllAddressByCity(@Param("city") String city);*/
}
