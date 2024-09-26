class Faxineiro extends Funcionario {
    public Faxineiro(String nome, int id) {
        super(nome, id);
    }

    public void solicitarMaterial() {
        System.out.println(getNome() + " está solicitando material de limpeza.");
    }
}
