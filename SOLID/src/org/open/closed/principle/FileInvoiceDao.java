package org.open.closed.principle;

import org.single.responsibility.Invoice;

public class FileInvoiceDao implements InvoiceDao {

	@Override
	public void save(Invoice invoice) {
		// save invoice data to file. 
		
	}
	
}
