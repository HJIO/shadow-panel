package com.moekr.shadow.panel.logic.service;

import com.moekr.shadow.panel.logic.vo.InvoiceVO;
import com.moekr.shadow.panel.web.dto.InvoiceDTO;

import java.util.List;

public interface InvoiceService {
	InvoiceVO create(InvoiceDTO invoiceDTO);

	InvoiceVO retrieve(int id);

	List<InvoiceVO> recentInvoice(int userId);
}
