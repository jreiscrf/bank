
package desafiobanco;

public class ContaBanco {
    
    //Parametros
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Metodos
    public void estadoAtual() {
        System.out.println("-------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());        
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Sua conta foi aberta com sucesso");
    }
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Sua conta possui Saldo");
        } else if (this.getSaldo() < 0) {
            System.out.println("Sua conta está em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada");
        }
    }
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em conta fechada");
        }
    }
    public void sacar( float v) {
        if(this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Conta Inexistente!");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
    
    // Metodos Especiais
    
    public ContaBanco() {
       this.saldo = 0;
       this.status = false;
    } 
    public void setNumConta(int a) {
        this.numConta = a;
    }
    public int getNumConta() {
        return this.numConta;
    }
    public void setTipo(String b) {
        this.tipo = b;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setDono(String c) {
        this.dono = c;
    }
    public String getDono() {
        return this.dono;
    }
    public void setSaldo(float d) {
        this.saldo = d;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setStatus(boolean e) {
        this.status = e;
    }
    public boolean getStatus() {
        return this.status;
    }
    
}




