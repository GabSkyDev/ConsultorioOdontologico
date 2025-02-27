package consultorio_gabriel_sousa;
//Gabriel Lima de Sousa

//Classe abstrata
abstract class Colaborador {
    protected String nome;
    protected String cpf;
    protected String email;
    protected String telefone;
    
    public Colaborador(String nome, String cpf, String email, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }
    
    //Métodos abstratos
    public abstract String getNome();
    public abstract void setNome(String nome);
    public abstract String getCPF();
    public abstract void setCPF(String cpf);
    public abstract String getEmail();
    public abstract void setEmail(String email);
    public abstract String getTelefone();
    public abstract void setTelefone(String telefone);
    
    //Validadores
    public abstract boolean validarCPF(String cpf);
    public abstract boolean validarTelefone(String telefone);
}
