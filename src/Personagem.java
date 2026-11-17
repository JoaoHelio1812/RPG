class Personagem {
    int id;
    String nome;
    int nivel;
    String classe;
    public PilhaInventario inventario; // <--- O atributo precisa estar aqui!

    public Personagem(int id, String nome, int nivel, String classe) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
        this.classe = classe;
        this.inventario = new PilhaInventario(); // Inicializa a pilha do inventário
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Nível: " + nivel + " | Classe: " + classe;
    }
}


