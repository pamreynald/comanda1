package com.rctecnologia.projeto1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rctecnologia.projeto1.Model.comandaModel;


@Controller
public class comandaController {
@GetMapping("/comanda")
public String comandaFormulario (Model model) {
	model.addAttribute("comanda", new comandaModel());
	return "Formulario";
}
 @PostMapping("/comandaModel")
 public String relatorioComanda() {
	 return "relatorio";
}
}