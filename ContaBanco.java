package ContaBanco;
public class ContaBanco {
	//Atributos 
	public int numConta;
	protected String tipo;
	private String nomeUsuario;
	private Float saldo;
	private Boolean status;
	
	
	// Métodos 
	
	public void estadoAtual() {
		System.out.println("--------------------------");
		System.out.println("Conta:" + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Usuario:" + this.getNomeUsuario());
		System.out.println("Saldo:" + this.getSaldo());
		System.out.println("Status:"+ this.getStatus());
		
		//Métodos Personalizados
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
		this.setSaldo (50f);	
	}else if (t == "CP") {
		this.setSaldo (150f);
		}
		System.out.println("Conta aberta com sucesso");
		
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
		System.out.println("Conta nãopode ser fechada porque ainda tem dinheiro na conta");		
		} else if (this.getSaldo() < 0) {
			
			System.out.println("Conta não pode ser fechada pois tem débitos");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
		
		
		
	}
	
	public void depositar(float v) {
		if (this.getStatus ()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado na conta de " + this.getNomeUsuario());	
			
		} else {
			System.out.println("Conta não existe");
		}
		
	}
	public void sacar(float v) {
		if (this.getStatus()) {
		if	(this.getSaldo () >= v);{
			this.setSaldo(this.getSaldo() - v);
			System.out.println("saque realizado na conta de " + this.getNomeUsuario());
			
		}  {
			System.out.println("Saldo insuficiente para saque");
			}
		
		} else {
			System.out.println("Conta não existe");
			
		}
			
		
			
		}
		
	
	public void pagarMensal() {
		int v = 0;
		if(this.getTipo() == "CC") {
			v = 12;
		}else if (this.getTipo() == "CP") {
			v = 20;
			
		}
		
		if (this.getStatus()) {
			
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso" + this.getNomeUsuario());
		} else {
			System.out.println("Conta não existe");
		}
	}
	
	//Métodos Especiais
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public Float getSaldo() {
		return saldo;
	}
	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
}
