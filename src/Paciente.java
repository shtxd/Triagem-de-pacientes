public class Paciente {
    // Atributos privados
    private String nome;
    private int idade;
    private double temperatura;
    private double pressaoArterial;

    // Construtor vazio
    public Paciente() {
    }

    // Construtor com dados
    public Paciente(String nome, int idade, double temperatura, double pressaoArterial) {
        this.nome = nome;
        this.idade = idade;
        this.temperatura = temperatura;
        this.pressaoArterial = pressaoArterial;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(double pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    // Retorna a classificação: Alto / Médio / Baixo
    public String classificarRisco() {
        if (this.temperatura > 39 || this.pressaoArterial > 18) {
            return "Alto risco";
        } else if (this.temperatura >= 37 && this.temperatura <= 39) {
            return "Médio risco";
        } else {
            return "Baixo risco";
        }
    }

    // Mostra os dados do paciente
    public void exibirDados() {
        System.out.println("Nome: " + this.nome + " | Idade: " + this.idade +
                " | Temperatura: " + this.temperatura + " | Pressão arterial: " + this.pressaoArterial +
                " | Classificação: " + classificarRisco());
    }

    // Notas simples de POO:
    // Objeto = instância de classe. 'new' cria o objeto.
    // Getters/setters acessam atributos privados.
}
