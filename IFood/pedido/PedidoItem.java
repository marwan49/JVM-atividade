package IFood.pedido;

import IFood.cadastro.Cardapio;

public class PedidoItem {
	private Integer id;
	private Integer quantidade;
	private Double taxaEntrega;
	private Double valorVenda;
	private Double valorTotal;
	private Cardapio cardapio;
	
	public Double getTaxaEntrega() {
		return taxaEntrega;
	}
	public void setTaxaEntrega(Double taxaEntrega) {
		this.taxaEntrega = taxaEntrega;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Cardapio getCardapio() {
		return cardapio;
	}
	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
	
	

}
