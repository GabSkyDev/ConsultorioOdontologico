package consultorio_gabriel_sousa;
//Gabriel Lima de Sousa

//Classe Pagamento
class Pagamento {
    private double valor;
    private String tipoPagamento;
    private int parcelas;
    private int notaFiscal;
    
    public Pagamento(double valor, String tipoPagamento, int parcelas, int notaFiscal){
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
        this.parcelas = parcelas;
        this.notaFiscal = notaFiscal;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public String getTipoPagamento(){
        return tipoPagamento;
    }
    
    public void setTipoPagamento(String tipoPagamento){
        this.tipoPagamento = tipoPagamento;
    }
    
    public int getParcelas(){
        return parcelas;
    }
    
    public void setParcelas(int parcelas){
        this.parcelas = parcelas;
    }
    
    public int getNotaFiscal(){
        return notaFiscal;
    }
    
    public void setNotaFiscal(int notaFiscal){
        this.notaFiscal = notaFiscal;
    }
}
