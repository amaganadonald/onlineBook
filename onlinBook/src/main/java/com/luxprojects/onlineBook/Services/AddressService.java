package com.luxprojects.onlineBook.Services;


import org.springframework.stereotype.Service;

import com.luxprojects.onlineBook.Dtos.AddressRequestDTO;
import com.luxprojects.onlineBook.Dtos.AddressResponseDTO;
import com.luxprojects.onlineBook.Interfaces.IAddress;
import com.luxprojects.onlineBook.Repository.AddressRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@AllArgsConstructor
public class AddressService implements IAddress{
	

	private AddressRepository addressRepository;

	@Override
	public Flux<AddressResponseDTO> getAllAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<AddressResponseDTO> getAddressById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<AddressResponseDTO> addAddress(AddressRequestDTO addressRequestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<AddressResponseDTO> updateAddress(AddressRequestDTO addressRequestDTO, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAddress(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



   
	/**
	 * @return all All Address in List ctrl+alt+j
	 */
	/*@Override
	public List<AddressResponseDTO> getAllAddress() throws OnlineBookBusinessException {
		log.info("AddressService:getAllAddress starting fetch all addresss");
		try {
			return addressRepository.findAll().stream()
					.map(AddressMapper::addressToAddressResponseDTO)
					.toList();
		} catch (Exception ex) {
			log.error("AddressService:getAllAddress fetch all addresss failed with message {}", ex.getMessage());
			throw new OnlineBookBusinessException("fetch all addresss failed with message" + ex.getMessage());
		}
	}
	
	public Address getAddressByIds(Long id) {
		log.info("AddressServie:getAddressById starting to fetch address by id {} ", id);
		 if (id == null || id <= 0) {
	            throw new IllegalArgumentException("Invalid user ID");
	        }

		try {
			Optional<Address> address = addressRepository.findById(id);
			log.info("AddressServie:getAddressById fetch address with message {} ", address.toString());
			return address.get();
			
		} catch (Exception e) {
			log.error("AddressServie:getAddressById fetch address by id faile with message {} ", e.getMessage());
			throw new OnlineBookBusinessException("fetch address by id faile with message {} " + e.getMessage());
		}
		
	}

	@Override
	public AddressResponseDTO getAddressById(Long id) {
		Address address = getAddressByIds(id);
		return AddressMapper.addressToAddressResponseDTO(address);
	}

	@Override
	public AddressResponseDTO addAddress(AddressRequestDTO addressRequestDTO) {
		try {
			Address address = AddressMapper.addressDtoToAddress(addressRequestDTO);
			addressRepository.save(address);
			return AddressMapper.addressToAddressResponseDTO(address);
		} catch (Exception e) {
			log.error("AddressServie:addAddress add address failed with message {} ", e.getMessage());
			throw new OnlineBookBusinessException("add address failed with message {} " + e.getMessage());
		}
	}

	@Override
	public AddressResponseDTO updateAddress(AddressRequestDTO addressRequestDTO, Long id) {
		Address address = getAddressByIds(id);
		try {
			address.setAddressCity(addressRequestDTO.getAddressCity());
			address.setAddressName(addressRequestDTO.getAddressName());
			address.setAdressNumber(addressRequestDTO.getAdressNumber());
			addressRepository.save(address);
		} catch (Exception e) {
			log.error("AddressServie:updateAddress update address by id failed with message {} ", e.getMessage());
			throw new OnlineBookBusinessException("update address by id failed with message {} " + e.getMessage());
		}
		return AddressMapper.addressToAddressResponseDTO(address);
	}

	@Override
	public String deleteAddress(Long id) {
		Address address = getAddressByIds(id);
		try {
			addressRepository.delete(address);
		} catch (Exception e) {
			log.error("Error deleted address with message {}", e.getMessage());
			throw new OnlineBookBusinessException("Error deleted address with message" + e.getMessage());
		}
		return "Address deleted successful";
	}
*/
	/**
	 * @return all Address by page and size
	 */
	/*@Override
	public Page<AddressResponseDTO> getAllAddressPage(int page, int size) {
		Page<Address> pageAddress = addressRepository.findAllAddresPage(PageRequest.of(page, size));
		List<AddressResponseDTO> addressResponseDTOs = pageAddress.getContent().stream()
				.map(AddressMapper::addressToAddressResponseDTO)
				.toList();
		return new PageImpl<>(addressResponseDTOs, pageAddress.getPageable(), pageAddress.getTotalElements());
	}*/

}
