package br.com.infnet.questionario.dto;

public enum OPCAO {

	CT("Concordo Totalmente"),CO("Concordo"), NN("N�o Concordo nem Discordo"), DI("Discordo"),DT("Discordo Totalmente"),NS("N�o sei avaliar");
	
	private String stringValue;
	
	private OPCAO(String opcao) {
		this.stringValue = opcao;
	}

	public String getStringValue() {
		return stringValue;
	}
	
}
