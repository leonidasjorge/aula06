package br.com.db1.start.classe;

public class Executadora {
	
	public static void main(String[] args) {
		//exibirCepFormatado(80540150);
		//exibirCepFormatado(87909990);
		//exibirCepFormatado(89079660);
		exibirDocumentoFormatado("06524871901");
		exibirDocumentoFormatado("1085702101");		
	}

	private static void exibirCepFormatado(Integer cep) {
		Endereco endereco = new Endereco();
		endereco.setCep(cep);
		
		System.out.println(endereco.getCepFormatado());
	}
	
	private static void exibirDocumentoFormatado(String documento) {
		Emitente emitente = new Emitente();
		emitente.setDocumento(documento);
		
		System.out.println(emitente.getDocumentoFormatado());
	}	
	
}
