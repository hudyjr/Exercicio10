package Exerc10;

public class Pessoa {
    String Nome;
    int Idade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) throws IdadeInvalidaException{
        if(Idade<=0){
            throw new IdadeInvalidaException ("Idade Invalida");
        }
        this.Idade = Idade;
    }

    public Pessoa(String Nome, int Idade) throws IdadeInvalidaException {
        this.setNome (Nome);
        this.setIdade (Idade);
    }
    
    
}
