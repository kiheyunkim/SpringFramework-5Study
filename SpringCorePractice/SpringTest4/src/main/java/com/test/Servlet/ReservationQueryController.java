package com.test.Servlet;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.kim.Reservation;
import com.test.kim.ReservationService;

@Controller
@RequestMapping("reservationQuery")
public class ReservationQueryController {

	private final ReservationService reservationService;
	
	public ReservationQueryController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@GetMapping
	public void setupForm() {
		
	}
	
	@PostMapping
	public String sumbitForm(@RequestParam("courtName") String courtName, Model model) {
		List<Reservation> reservations = java.util.Collections.emptyList();
		if(courtName !=null) {
			reservations = reservationService.query(courtName);
		}
		model.addAttribute("reservation",reservations);
		return "reservationQuery";
	}
}
