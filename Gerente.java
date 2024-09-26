class Gerente extends Funcionario {
    public Gerente(String nome, int id) {
        super(nome, id);
    }

    public void fecharCaixa() {
        System.out.println(getNome() + " está fechando o caixa.");
    }

    public void solicitarMaterial() {
        System.out.println(getNome() + " está solicitando material.");
    }
}
