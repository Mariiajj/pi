package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ifrn.pi.eventos.models.Evento;

@Controller
public class EventosController {
	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}

	@RequestMapping(value = "/formsubimetido", method = RequestMethod.POST)
	public String salvar(String nome, String local, String data, String horario) {
		
		System.out.println("Nome: " + nome);
		System.out.println("Local: " + local);
		System.out.println("Data: " + data);
		System.out.println("Horário: " + horario);
		
		return "formConfirmacao";
	}
	
	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		
		return "evento-adicionado";
	}
}
