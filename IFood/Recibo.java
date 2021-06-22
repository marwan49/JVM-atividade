package IFood;

import java.text.SimpleDateFormat;

import IFood.cadastro.Empresa;
import IFood.cadastro.Endereco;
import IFood.formatador.Formatador;
import IFood.pedido.Pedido;

public class Recibo {
	public static void imprimirPedido(Pedido pedido) {
		Empresa BurguerX = pedido.getEmpresa();
		
		Endereco e = BurguerX.getCadastro().getEndereco();
		String cep = Formatador.formataCep(BurguerX.getCadastro().getEndereco().getCep());
		
		StringBuilder sb = new StringBuilder();
		sb.append(BurguerX.getCadastro().getNome() + "\n");
		sb.append(String.format("%s %s %s %s %s|Cep:%s \n", e.getRua(), e.getNumero(), e.getBairro(), e.getCidade(), e.getEstado(), cep));
		sb.append(String.format("IE:%s\nIM:%s \n", Formatador.formataIe(BurguerX.getIe().toString()), Formatador.formataIm(BurguerX.getIm().toString())));
		
		sb.append("----------------------------------------------------------------\n");
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		String dataFormatada = formatador.format(pedido.getData());
		sb.append(String.format("%-40s CCF:%06d CCO:%06d",dataFormatada, pedido.getCcf(), pedido.getCoo()) );

		sb.append("\n----------------------------------------------------------------\n");
		
		sb.append(String.format("%-35s%10s%10s%9s\n", "ITEM","QUANT", "R$ UNIT", "R$ TOTAL"));
		
		sb.append("\n----------------------------------------------------------------\n");
		sb.append("Valor Total: R$ " + pedido.getValorTotal());
		
		
		System.out.println(sb.toString());
	}

}
