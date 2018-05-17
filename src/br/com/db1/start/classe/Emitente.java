package br.com.db1.start.classe;

import java.text.BreakIterator;

import org.w3c.dom.css.DocumentCSS;

public class Emitente {
	
	private String nome;
	
	private String documento;
	
	private byte[] assinatura;

	public String getDocumentoFormatado() {
		String documentoFormatado = documento;
		
		if (documentoFormatado.length() == 11) {
			documentoFormatado = documentoFormatado.substring(0, 3) + "."
			+ documentoFormatado.substring(3, 6) + "."
			+ documentoFormatado.substring(6, 9) + "-"
			+ documentoFormatado.substring(9, 11);	
		}
		
		return documentoFormatado;		
	}	
	
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
		
}
