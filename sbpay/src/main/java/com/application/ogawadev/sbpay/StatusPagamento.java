package com.application.ogawadev.sbpay;

public enum StatusPagamento {

	Autorizado("Autorizado"),
	NaoAutorizado("Nao autorizado pela instituicao financeira"),
	CartaoInvalido("Cartao invalido ou bloqueado");
	
	String descricao;
	
	private StatusPagamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
