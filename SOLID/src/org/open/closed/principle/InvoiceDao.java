package org.open.closed.principle;

import org.single.responsibility.Invoice;

public interface InvoiceDao {
	
	public void save(Invoice invoice);
}
