package IFood;

import IFood.cadastro.Cadastro;
import IFood.pedido.Pedido;
import IFood.pedido.PedidoItem;
import IFood.cadastro.Cardapio;
import IFood.cadastro.Empresa;
import IFood.cadastro.Endereco;

public class Aplication{
	public static void main(String[] args) {

		Empresa BurguerX = new Empresa();
		BurguerX.setIe(1234567L);
		BurguerX.setIm(7654321L);
		Cadastro cadBurguerX = new Cadastro();
		cadBurguerX.setId(896547);
		cadBurguerX.setNome("BurguerX lanches");
		cadBurguerX.setTelefone(5511685235668L);
		cadBurguerX.setEmail("burguerx@gmail.com");
		cadBurguerX.setCpfCnpj("47823657941254");
		BurguerX.setCadastro(cadBurguerX);
		Endereco endBurguerX = new Endereco();
		endBurguerX.setCep("03246056");
		endBurguerX.setRua("rua Algumaa coisa");
		endBurguerX.setNumero(466);
		endBurguerX.setCidade("São Paulo");
		endBurguerX.setEstado("São paulo");
		endBurguerX.setPais("Brasil");
		cadBurguerX.setEndereco(endBurguerX);
		Cardapio carBurguerX = new Cardapio();
		carBurguerX.setId(854297);
		carBurguerX.setProduto("X Salada");
		carBurguerX.setPreco(20.00);
		BurguerX.setCardapio(carBurguerX);
		
		Cadastro cliente = new Cadastro();
		cliente.setNome("joão Rock Oliveira");
		cliente.setCpfCnpj("698347621 11");
		cliente.setEmail("jrock@gmail.com");
		cliente.setTelefone(11856742335L);
		cliente.setId(785126);
		Endereco endCliente = new Endereco();
		endCliente.setCep("12346056");
		endCliente.setRua("rua Algum lugar");
		endCliente.setNumero(66);
		endCliente.setCidade("São Paulo");
		endCliente.setEstado("São paulo");
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
		p1.setData("23.10.2001");
		p1.setValorTotal(pi1.getValorTotal());
		p1.setComprador(cliente);
		p1.setEmpresa(BurguerX);
		p1.setCcf(123456);
		p1.setCoo(654321);
		
	}
}
