package co.grandcircus.hotalApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@Controller
public class HotelController {
	
	 @Autowired
	    private HotelRepository hotelRepo;
	 
	 @GetMapping("/")
	 public String homepage() {
		return "home";
		 
	 }
	 
	 @GetMapping("/results")
	 public String results(Model model, @RequestParam String city) {
		 List<Hotel> hotels;
		 
		 hotels = hotelRepo.findByCity(city);
		 
		 model.addAttribute("hotels", hotels);
		 model.addAttribute("city", city);
		 
		 return "result";
		 
	 }
	 


}
