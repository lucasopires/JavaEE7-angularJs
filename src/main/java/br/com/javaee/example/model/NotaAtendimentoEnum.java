package br.com.javaee.example.model;

public enum NotaAtendimentoEnum {

	RUIM("Ruim"), BOM("Bom"), OTIMO("Ótimo"), EXCELENTE("Excelente");

	private String notaAtendimento;

	NotaAtendimentoEnum(String notaAtendimento) {
		this.notaAtendimento = notaAtendimento;
	}

	public String getNota() {
		return notaAtendimento;
	}

}
