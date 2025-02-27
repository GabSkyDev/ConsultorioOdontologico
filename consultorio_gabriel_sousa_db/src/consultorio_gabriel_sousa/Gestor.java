package consultorio_gabriel_sousa;
//Gabriel Lima de Sousa

//Classe Gestor
class Gestor extends Colaborador {
    private String estoqueManutencao;
    
    public Gestor(String nome, String cpf, String email, String telefone, String estoqueManutencao){
        super(nome, cpf, email, telefone);
        this.estoqueManutencao = estoqueManutencao;
    }
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCPF() {
        return cpf;
    }

    @Override
    public void setCPF(String cpf) {
        if (validarCPF(cpf)){
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido");  
        }
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        if (validarTelefone(telefone)){
            this.telefone = telefone;
        } else {
            throw new IllegalArgumentException("Telefone inválido");  
        }
    }
    
    @Override
    public boolean validarCPF(String cpf){
        return cpf.matches("\\d{11}");
    }
    
    @Override
    public boolean validarTelefone(String telefone){
        return telefone.matches("\\d{10}");
    }
    
    public String getEstoqueManutencao(){
        return estoqueManutencao;
    }
    
    public void setEstoqueManutencao(String estoqueManutencao){
        this.estoqueManutencao = estoqueManutencao;
    }
}
