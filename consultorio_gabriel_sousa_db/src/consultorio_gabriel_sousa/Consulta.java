package consultorio_gabriel_sousa;
//Gabriel Lima de Sousa

//Classe Consulta
class Consulta {
    private Paciente nomePaciente;
    private Dentista nomeDentista;
    private String tipoTratamento;
    private String prontuario;
    
    public Consulta(Paciente nomePaciente, Dentista nomeDentista, String tipoTratamento, String prontuario){
        this.nomePaciente = nomePaciente;
        this.nomeDentista = nomeDentista;
        this.tipoTratamento = tipoTratamento;
        this.prontuario = prontuario;
    }
    
    public Paciente getNomePaciente(){
        return nomePaciente;
    }
    
    public void setNomePaciente(Paciente nomePaciente){
        this.nomePaciente = nomePaciente;
    }
    
    public Dentista getNomeDentista(){
        return nomeDentista;
    }
    
    public void setNomeDentista(Dentista nomeDentista){
        this.nomeDentista = nomeDentista;
    }
    
    public String getTipoTratamento(){
        return tipoTratamento;
    }
    
    public void setTipoTratamento(String tipoTratamento){
        this.tipoTratamento = tipoTratamento;
    }
    public String getProntuario(){
        return prontuario;
    }
    public void setProntuario(String prontuario){
        this.prontuario = prontuario;
    }
    
    public void mostrarDados(){
        System.out.println("---- Consulta ----");
        System.out.println("Paciente: " + nomePaciente.nome);
        System.out.println("Dentista Responsável: " + nomeDentista.nome);
        System.out.println("Tratamento: " + tipoTratamento);
        System.out.println("Prontuário: " + prontuario);
        System.out.println("------------------");
    }
}
