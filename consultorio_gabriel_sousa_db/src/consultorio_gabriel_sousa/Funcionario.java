package consultorio_gabriel_sousa;
//Gabriel Lima de Sousa

//Classe Funcionário
class Funcionario extends Colaborador {
    private String tipoConsulta;
    
    public Funcionario(String nome, String cpf, String email, String telefone, String tipoConsulta){
        super(nome, cpf, email, telefone);
        this.tipoConsulta = tipoConsulta;
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
    public boolean validarTelefone(String telefone){
        return telefone.matches("\\d{10}");
    }
    
    @Override
    public boolean validarCPF(String cpf){
        return cpf.matches("\\d{11}");
    }
    
    public String getTipoConsulta(){
        return tipoConsulta;
    }
    
    public void setTipoConsulta(String tipoConsulta){
        this.tipoConsulta = tipoConsulta;
    }   
}
