package consultorio_gabriel_sousa;
//Gabriel Lima de Sousa

//Classe Estoque
class Estoque {
    private String tipoProduto;
    private String descarteEsteril;
    
    public Estoque(String tipoProduto, String descarteEsteril){
        this.tipoProduto = tipoProduto;
        this.descarteEsteril = descarteEsteril;
    }
    
    public String getTipoProduto(){
        return tipoProduto;
    }
    
    public void setTipoProduto(String tipoProduto){
        this.tipoProduto = tipoProduto;
    }
    
    public String getDescarteEsteril(){
        return descarteEsteril;
    }
    
    public void setDescarteEsteril(String descarteEsteril){
        this.descarteEsteril = descarteEsteril;
    }
}
