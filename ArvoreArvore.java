/*
 * @author Isabela Ferreira Scarabelli / Paulo Eder Medeiros Cardoso / Pedro Henrique de Almeida Santos
 */
public class ArvoreArvore {
    public No raiz;
    public No suporteatq, suportedef, tankatq, tankdef, danoatq, danodef, curasupatq, danosupdef, vidadanodef,
            rapidodanodef, vidatankdef, danotankdef, curasupdef, danosupatq, vidadanoatq, rapidodanoatq, vidatankatq,
            danotankatq; // Raiz da arvore.
    public No atq, def;

    /*
     * Construtor da classe.
     */
    public ArvoreArvore() {

        raiz = new No(0, atq, def, null, "");

        atq = new No(1, suporteatq, danoatq, tankatq, "");
        suporteatq = new No(2, curasupatq, danosupatq, null, "");
        danoatq = new No(2, vidadanoatq, rapidodanoatq, null, "");
        tankatq = new No(2, vidatankatq, danotankatq, null, "");
        curasupatq = new No(3, null, null, null, "Lucio",
                "https://drive.google.com/drive/folders/1sdcCIZ8-4lmiMS25yJqVKb2IuCQQfzVH");
        danosupatq = new No(3, null, null, null, "Bloom",
                "https://drive.google.com/drive/folders/1Zak4ETei-EWO-0tqrJI5AvrKtgysIjgf");
        vidatankatq = new No(3, null, null, null, "Ralph",
                "https://drive.google.com/drive/folders/1KWc3kLUnAFszT5y8gCha_Ma5t3cWSbrD");
        danotankatq = new No(3, null, null, null, "Peter Parker",
                "https://drive.google.com/drive/folders/1rJPa7DoVxF5fqya0yJsFgUk6qukYwYZv");
        vidadanoatq = new No(3, null, null, null, "Sid",
                "https://drive.google.com/drive/folders/1lEbAv6hi1crHRECSL3fHJEyHvKutCUzS");
        rapidodanoatq = new No(3, null, null, null, "Barry Allen (Flash)",
                "https://drive.google.com/drive/folders/1bmaNlKxSV3bVfG_CJ-ZTnE8fgP2rerPw");

        def = new No(1, suportedef, danodef, tankdef, "");
        suportedef = new No(2, curasupdef, danosupdef, null, "");
        danodef = new No(2, vidadanodef, rapidodanodef, null, "");
        tankdef = new No(2, vidatankdef, danotankdef, null, "");
        curasupdef = new No(3, null, null, null, "Chopper",
                "https://drive.google.com/drive/folders/1XIZKxKRVrEnX4FZzOZYoJrmhlG_lj6QT");
        danosupdef = new No(3, null, null, null, "Marco",
                "https://drive.google.com/drive/folders/1A_DUv_MEGpAK7BwYUqI2udyWr2aUd1_4");
        vidatankdef = new No(3, null, null, null, "Peni Parker",
                "https://drive.google.com/drive/folders/18QIEX_HSrN6D4-8M-uudVBXpiWTy5Yvc");
        danotankdef = new No(3, null, null, null, "Shrek",
                "https://drive.google.com/drive/folders/1SjiJziVK1zJKy_ZtWsOn0rn7ob6lOkcG");
        vidadanodef = new No(3, null, null, null, "Alphonse",
                "https://drive.google.com/drive/folders/1fl8jciCXF5irOqzCDpakmFCj16rm4Tme");
        rapidodanodef = new No(3, null, null, null, "Pernalonga",
                "https://drive.google.com/drive/folders/1lATWPThtfjJH8LTKWwWPxR-NlB4qWrs4");
    }

    public No getRaiz() {

        return this.raiz;

    }

}