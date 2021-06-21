package IFood;

import IFood.cadastro.Empresa;
import IFood.pedido.Pedido;


public class Recibo {
	public static void imprimirPedido(Pedido pedido) {
		
		Empresa BurguerX = pedido.getEmpresa();
		
		StringBuilder sb = new StringBuilder();
		sb.append(BurguerX.getCadastro().getNome() + "\n");
		sb.append(String.format("%s %d %s %s %s \n",BurguerX.getCadastro().getEndereco().getRua(), BurguerX.getCadastro().getEndereco().getNumero(), BurguerX.getCadastro().getEndereco().getBairro(), BurguerX.getCadastro().getEndereco().getCidade(), BurguerX.getCadastro().getEndereco().getEstado()));
		sb.append(String.format("IE: %d \nIM %s \n", BurguerX.getIe(), BurguerX.getIm()));
		
		System.out.println(sb.toString());
	}

}
