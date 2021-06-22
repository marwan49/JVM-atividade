package IFood.pedido;

import java.util.Date;

import IFood.cadastro.Cadastro;
import IFood.cadastro.Empresa;

public class Pedido {

	private Integer id;
	private Date data;
	private Double valorTotal;
	private Cadastro comprador;
	private Empresa empresa;
	private Integer ccf;
	private Integer coo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Cadastro getComprador() {
		return comprador;
	}
	public void setComprador(Cadastro comprador) {
		this.comprador = comprador;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Integer getCcf() {
		return ccf;
	}
	public void setCcf(Integer ccf) {
		this.ccf = ccf;
	}
	public Integer getCoo() {
		return coo;
	}
	public void setCoo(Integer coo) {
		this.coo = coo;
	}
	
	
	
}
