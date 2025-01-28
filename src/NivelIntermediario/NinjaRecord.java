package NivelIntermediario;

public record NinjaRecord(String nome, String email, int telefone) {

    //Todos os atributos sao final por padrão
    // Nao se tem SETTER, QUANDO NAO SE IRA ALTERAR - NOMEDO FUNCIONARIO,

    public String emailCaixaAlta(){
        return email.toUpperCase();
    }


}
