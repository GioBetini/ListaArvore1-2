import arvoreInt.ArvoreInt;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        int[] vet = {33, 15, 41, 38, 47, 34, 49, 43};
        ArvoreInt arvore = new ArvoreInt();
        for(int i : vet){
            arvore.insert(i);
        }
        try{
            System.out.println("Atravessamento pré-ordem");
            arvore.prefixSearch();
            System.out.println("=====================================================");
            System.out.println("Atravessamento em ordem");
            arvore.infixSearch();
            System.out.println("=====================================================");
            System.out.println("Atravessamento pós-fixo");
            arvore.postfixSearch();
            System.out.println("=====================================================");
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
