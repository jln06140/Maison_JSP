package co.simplon.hote.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.simplon.hote.model.Client;
import co.simplon.hote.service.ServiceClient;

@Controller
@RequestMapping("/")
public class ClientController {

	
	@Autowired
	private ServiceClient serviceClient;
	
	
	@GetMapping("/listeClients")
	public String allClients(Model model) throws Exception {
		ArrayList<Client> listClients = (ArrayList<Client>) this.serviceClient.getAllClients();
		model.addAttribute("clients", listClients);
		return "listeClients";
	}
	
	
}
