package org.open.closed.principle;

import org.single.responsibility.Invoice;

public class DatabaseInvoiceDao implements InvoiceDao {

	@Override
	public void save(Invoice invoice) {
		// save to SQL DB
		
	}
	
}
