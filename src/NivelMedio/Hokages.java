package NivelMedio;

// Classe "abstract" não pode ser instanciada diretamente com "new Hokages()".
// Ela serve como BASE para outras classes (Senju, por exemplo, usa "extends Hokages").
// Pense nela como um modelo incompleto que as subclasses precisam completar.
public abstract class Hokages {

    // "protected" = visível dentro desta classe E nas subclasses que herdam dela.
    // Se fosse "private", as subclasses não conseguiriam acessar esses atributos.
    protected String nome;
    protected int idade;
    protected boolean vivouOuNao;

    // Construtor vazio: necessário quando você cria o objeto sem passar dados (new Senju())
    // Java cria esse automaticamente, mas quando você declara outro construtor
    // precisa criar esse manualmente também se quiser continuar usando.
    public Hokages() {}

    // Construtor com argumentos: permite criar o objeto já preenchendo os dados.
    // Exemplo: new Senju("Tobirama", 45, false)
    public Hokages(String nome, int idade, boolean vivouOuNao) {
        // "this.nome" = o atributo da classe | "nome" = o parâmetro recebido
        this.nome = nome;
        this.idade = idade;
        this.vivouOuNao = vivouOuNao;
    }

    // Métodos abstratos: subclasses OBRIGATORIAMENTE precisam implementá-los.
    // Aqui só declaramos a assinatura; o corpo ({}) fica nas subclasses.
    public abstract void mostrarInformacoes();

    public abstract void sabedoriaHokage();
}
