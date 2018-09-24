package ordenacaoIII;

public class Funcionario {
		public static String metas;
		public static Double salario;
		
		public static String getMetas() {
			return metas;
		}
		public static void setMetas(String metas) {
			Funcionario.metas = metas;
		}
		public static Double getSalario() {
			return salario;
		}
		public static void setSalario(Double salario) {
			Funcionario.salario = salario;
		}

		public Funcionario(String metas, Double salario) {
			this.metas = metas;
			this.salario = salario;
		
		}
		
		public String toString() {
			return "Meta: " + metas + "; Salario: " + salario;
			}	
		}
	

