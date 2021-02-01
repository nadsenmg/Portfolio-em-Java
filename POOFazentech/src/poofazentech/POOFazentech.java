package poofazentech;
public class POOFazentech {

    public static void main(String[] args) {
        
        Veterinario v = new Veterinario();
        
        v.setNome("Arnaldo");
        System.out.println("Nome dele é " + v.getNome());
        v.salvarFuncionario();
        
        
    }
    
}
