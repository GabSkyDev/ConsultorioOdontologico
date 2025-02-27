package consultorio_gabriel_sousa;
//Gabriel Lima de Sousa

//Classe Equipamento
class Equipamento {
    private String nome;
    private int quantidade;
    private String ultimaManutencao;
    private String periodoEntreManutencao;
    
    public Equipamento(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public String getUltimaManutencao(){
        return ultimaManutencao;
    }
    
    public void setUltimaManutencao(String ultimaManutencao){
        this.ultimaManutencao = ultimaManutencao;
    }
    
    public String getPeriodoEntreManutencao(){
        return periodoEntreManutencao;
    }
    
    public void setPeriodoEntreManutencao(String periodoEntreManutencao){
        this.periodoEntreManutencao = periodoEntreManutencao;
    }
}
