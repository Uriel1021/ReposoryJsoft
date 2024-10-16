package com.report.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.report.dao.IReportDao;
import com.report.modelo.Report;

@Service
public class ReportServiceImpl implements IReporteService{

	@Autowired
	private IReportDao dao;
	
	
	@Override
	public List<Report> listReport() {
		return (List<Report>) dao.findAll();
	}

	@Override
	public Optional<Report> getReportById(int id) {
		return dao.findById(id);
	}

	@Override
	public int saveReport(Report report) {
		int result = 0;
		Report report2 = dao.save(report);
		if(report2.equals(report2)) {
			result = 1;
		}
		return result;
	}

	@Override
	public void deleteReport(int id) {
		dao.deleteById(id);
	}

}
