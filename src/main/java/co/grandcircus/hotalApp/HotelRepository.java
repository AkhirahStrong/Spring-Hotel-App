package co.grandcircus.hotalApp;

import java.util.List;

//import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{
	
	List<Hotel> findByCity( String city);
    //List<Hotel> findByCityOrderByPricePerNightAsc(String city);

}
