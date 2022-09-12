package ContaBanco;

public class ClasseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ContaBanco p1 = new ContaBanco();
	p1.setNumConta(11111);
	p1.setNomeUsuario("Jubileu");
	p1.abrirConta("CC");
	
	
	ContaBanco p2 = new ContaBanco();
	p2.setNumConta(222222);
	p2.setNomeUsuario("Creuza");
	p2.abrirConta("CP");
	
	p1.depositar(100);
	p2.depositar(500);
	p2.sacar(100);
	
	
	p1.estadoAtual();
	p2.estadoAtual();
	
	}

}
