package ordenacaoIII;

public class Empresa {
	private static String nome;
	private static int CNPJ;
	
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Empresa.nome = nome;
	}
	public static int getCNPJ() {
		return CNPJ;
	}
	public static void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}

	public Empresa(String nome, int CNPJ) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		}
	public String toString() {
		return "Nome: " + nome + "; CNPJ: " + CNPJ;
		}
	}