package ordenacaoIII;

public class Proprietario {
	
		public static String gerenciamento;


		public static String getGerenciamento() {
			return gerenciamento;
		}

		public static void setGerenciamento(String gerenciamento) {
			Proprietario.gerenciamento = gerenciamento;
		}

		public Proprietario(String gerenciamento) {
			this.gerenciamento = gerenciamento;
		}
		
		public String toString() {
			return "Nome do propriétario: " + gerenciamento;
			}
	}
