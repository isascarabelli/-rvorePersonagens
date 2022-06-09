class No {
    public int nivel; // Conteudo do no.
    public String nome; // Nome do personagem
    public String link; // link carta do personagem
    public No esq; // No da esquerda.
    public No dir; // No da direita.
    public No meio;

    /**
     * Construtor da classe.
     * 
     * @param elemento Conteudo do no.
     * @param esq      No da esquerda.
     * @param dir      No da direita.
     */
    No(int nivel, No esq, No dir, No meio, String nome) {
        this.nivel = nivel;
        this.esq = esq;
        this.dir = dir;
        this.meio = meio;
        this.nome = nome;
        this.link = null;
    }

    No(int nivel, No esq, No dir, No meio, String nome, String link) {
        this.nivel = nivel;
        this.esq = esq;
        this.dir = dir;
        this.meio = meio;
        this.nome = nome;
        this.link = link;
    }
}