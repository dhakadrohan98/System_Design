package org.open.closed.principle;

import org.single.responsibility.Invoice;

public class MongoDBInvoiceDao implements InvoiceDao {

	@Override
	public void save(Invoice invoice) {
		// save invoice data into documented form.
		
	}

}
