package Exerc10;

public class TestaPessoa {
    public static void main(String args []){
        
       try{
        Pessoa p1 = new Pessoa("Hudson", 0);
       }catch (IdadeInvalidaException ex){
           System.out.println(ex.getMessage());
       }
    }
    
    
}
