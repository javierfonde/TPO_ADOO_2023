package modulo_pagos;

import modulo_pagos.Comprobante;

public interface IPago {
	public Comprobante cobrar(Factura factura);
	

}
