package br.com.db1.start.classe;

import java.util.Date;
import java.util.List;

public class Recibo {
	
	private Integer numero;
	
	private Double valor;
	
	private Date dataCadastro;
	
	private Boolean confirmacao;
	
	private Date dataEmissao;
	
	private List<Servico> servicos;
	
	private Cidade cidade;	
	
	private Emitente emitente;
	
	private Pagador pagador;
	
	public String getValorDescritivo() {
		return "";
	}
	
	public String getDataEmissaoDescritiva() {
		return "";
	}
}
