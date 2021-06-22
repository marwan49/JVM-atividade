package IFood.formatador;

public class Formatador {
	private static String formataCnpj(String cnpj) {
		return cnpj.replaceAll(( "(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})" ), "$1.$2.$3/$4-$5" );
	}
	
	private static String formataCpf(String cpf) {
		return cpf.replaceAll( ( "(\\d{3})(\\d{3})(\\d{3})(\\d{2})" ) , "$1.$2.$3-$4");
	}
	
	public static String formatCpfCnpj(String cpfCnpj) {
		
		if (Validacao.isCpfCnpj(cpfCnpj)) {
			if (cpfCnpj.matches("\\d{11}")){
				return formataCpf(cpfCnpj);
			}
			
			if (cpfCnpj.matches("\\d{14}")) {
				return formataCnpj(cpfCnpj);
			}
		}
		return "CPF ou CPNJ inválido";
	}
	public static String formataCep(String cep) {
		if (Validacao.isCep(cep))
			return cep.replaceAll(("(\\d{2})(\\d{3})(\\d{3})"), "$1.$2-$3");
		return "CEP inválido";
	}
	public static String formataIe(String ie) {
		if (Validacao.isIe(ie))
			return ie.replaceAll( ( "(\\d{3})(\\d{3})(\\d{3})" ) ,"$1.$2.$3");
		return "IE inválido";
	}
	
	public static String formataIm(String im) {
		if (Validacao.isIm(im))
			return im.replaceAll( ( "(\\d{2})(\\d{3})(\\d{3})" ) ,"$1.$2.$3");
		return "IM inválido";
	}

}
