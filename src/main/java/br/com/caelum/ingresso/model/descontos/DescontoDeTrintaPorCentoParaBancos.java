package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoDeTrintaPorCentoParaBancos implements Descontos {
	
	private BigDecimal percentualDesconto = new BigDecimal("0.3");

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		// TODO Auto-generated method stub
		return precoOriginal.subtract(trintaPorCentoSobre(precoOriginal));
	}
	
	private BigDecimal 
	trintaPorCentoSobre(BigDecimal precoOriginal){
		return precoOriginal.multiply(percentualDesconto);
	}
	

}
