package com.report.service;

import java.util.List;
import java.util.Optional;

import com.report.modelo.Report;


public interface IReporteService {
	public List<Report> listReport();
	public Optional<Report> getReportById(int id);
	public int saveReport(Report report);
	public void deleteReport(int id);
}
