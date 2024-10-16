package com.report.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.report.modelo.Report;
import com.report.service.IReporteService;


@Controller
public class ReportController {
	@Autowired
	private IReporteService service;
	
	@GetMapping("/listar")
	public String listarReporte(Model model) {
		List<Report> reports = service.listReport();
		model.addAttribute("reportes",reports);
		return "index";
	}
	
	@GetMapping("/new")
	public String guardarReporte(Model model) {
		model.addAttribute("reporte", new Report());
		return "form";
	}
	
	@PostMapping("/save")
	public String saveReport(Report report) {
		service.saveReport(report);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editarReporte(@PathVariable int id, Model model) {
		Optional<Report> reporte = service.getReportById(id);
		model.addAttribute("reporte",reporte);
		return "form";
	}

	@GetMapping("/eliminar/{id}")
	public String eliminarReporte(@PathVariable int id) {
		service.deleteReport(id);
		return "redirect:/listar";
	}
}
