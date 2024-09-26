public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 101);
        Vendedor vendedor = new Vendedor("Ana", 102);
        Faxineiro faxineiro = new Faxineiro("João", 103);

        gerente.baterPonto();
        gerente.fecharCaixa();
        gerente.solicitarMaterial();

        vendedor.baterPonto();
        vendedor.realizarVenda();
        vendedor.solicitarMaterial();

        faxineiro.baterPonto();
        faxineiro.solicitarMaterial();
    }
}
