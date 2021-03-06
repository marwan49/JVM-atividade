package IFood;

import java.sql.Date;

import IFood.cadastro.Cadastro;
import IFood.pedido.Pedido;
import IFood.pedido.PedidoItem;
import IFood.cadastro.Cardapio;
import IFood.cadastro.Empresa;
import IFood.cadastro.Endereco;

public class Aplication{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Empresa BurguerX = new Empresa();
		BurguerX.setIe(123456789L);
		BurguerX.setIm(87654321L);
		Cadastro cadBurguerX = new Cadastro();
		cadBurguerX.setId(896547);
		cadBurguerX.setNome("BurguerX lanches");
		cadBurguerX.setTelefone(5511685235668L);
		cadBurguerX.setEmail("burguerx@gmail.com");
		cadBurguerX.setCpfCnpj("47823657941254");
		BurguerX.setCadastro(cadBurguerX);
		Endereco endBurguerX = new Endereco();
		endBurguerX.setCep("03246056");
		endBurguerX.setRua("Av Ipiranga");
		endBurguerX.setNumero("466");
		endBurguerX.setBairro("Republica");
		endBurguerX.setCidade("S?o Paulo");
		endBurguerX.setEstado("Sp");
		endBurguerX.setPais("Brasil");
		cadBurguerX.setEndereco(endBurguerX);
		Cardapio carBurguerX = new Cardapio();
		carBurguerX.setId(854297);
		carBurguerX.setProduto("X Salada");
		carBurguerX.setPreco(20.00);
		BurguerX.setCardapio(carBurguerX);
		
		Cadastro cliente = new Cadastro();
		cliente.setNome("jo?o Rock Oliveira");
		cliente.setCpfCnpj("698347621 11");
		cliente.setEmail("jrock@gmail.com");
		cliente.setTelefone(11856742335L);
		cliente.setId(785126);
		Endereco endCliente = new Endereco();
		endCliente.setCep("12346056");
		endCliente.setRua("rua Algum lugar");
		endCliente.setNumero("66");
		endCliente.setCidade("S?o Paulo");
		endCliente.setEstado("Sp");
		endCliente.setPais("Brasil");
		cliente.setEndereco(endCliente);
		
		PedidoItem pi1 = new PedidoItem();
		pi1.setId(100200);
		pi1.setQuantidade(3);
		pi1.setTaxaEntrega(8.20);
		pi1.setValorVenda(20.00);
		pi1.setCardapio(carBurguerX);
		pi1.setValorTotal(pi1.getValorVenda() * pi1.getQuantidade() + pi1.getTaxaEntrega());
		pi1.setQuantidade(3);
		Pedido p1 = new Pedido();
		p1.setId(100200);
		p1.setData(new Date(23,10,2001));
		p1.setValorTotal(pi1.getValorTotal());
		p1.setComprador(cliente);
		p1.setEmpresa(BurguerX);
		p1.setCcf(30);
		p1.setCoo(458);
		
		Recibo.imprimirPedido(p1);
		
	}
}
