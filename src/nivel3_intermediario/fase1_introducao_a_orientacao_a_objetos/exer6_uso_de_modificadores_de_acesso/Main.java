package nivel3_intermediario.fase1_introducao_a_orientacao_a_objetos.exer6_uso_de_modificadores_de_acesso;

public class Main {
    public void Publico(){
        // public (público) - É como deixar a porta aberta para qualquer pessoa entrar.
        // Se um método ou variável é "public", qualquer outra parte do código, mesmo de fora
        // da "casa" (classe), pode acessar.
    }
    private void Privado(){
        // private (privado) - Aqui, a porta está trancada, e só quem está dentro da "casa" (classe) pode
        // acessar o que está lá. Se um método ou variável é "private", apenas o próprio código dentro da
        // mesma classe pode usá-lo.
    }
    protected void Protegido(){
        //protected (protegido) - Imagine que você dá uma chave da porta para a família e
        // alguns amigos próximos. Se algo é "protected", pode ser acessado por outras classes que
        // são parentes (subclasses) ou que estão no mesmo pacote (grupo de classes).
    }
    /*default*/ void SemModificadores(){
        //default (sem modificador) - Isso é como deixar a porta destrancada, mas apenas para
        // pessoas no mesmo bairro (pacote). Se você não colocar nenhum modificador de acesso,
        // por padrão, o acesso é permitido apenas para classes dentro do mesmo pacote.
    }
}
