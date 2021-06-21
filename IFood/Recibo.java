package IFood;

import IFood.cadastro.Empresa;
import IFood.pedido.Pedido;

public class Recibo {
	public static void imprimirPedido(Pedido pedido) {
		
		Empresa BurguerX = pedido.getEmpresa();
		
		StringBuilder sb = new StringBuilder();
		sb.append(BurguerX.getCadastro().getNome() + "/n");
		sb.append(BurguerX.getCadastro().getEndereco().getRua() + "/n");
		
		System.out.println(sb.toString());
	}

}
