public class Motorista {
    
    //Atributos;
    
    private String nome;
    private Carro carroAtual;
    
    //Métodos especiais;
    
    public Motorista(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    //Métodos;
    
    public void entrarNoCarro(Carro carro){
        if(carroAtual == null && carro.getVelocidade() == 0){
            this.carroAtual = carro;
            carroAtual.setMotoristaAtual(this);
        }
    }
    
    public void sairDoCarro(){
        if(carroAtual != null && carroAtual.getVelocidade() == 0) {
            carroAtual.setMotoristaAtual(null);
            this.carroAtual = null;
        }
    }
    
    public String toString(){
        if(carroAtual == null)
            return this.nome;
        else
            return this.nome + " (" + carroAtual.getNome() + ") " + carroAtual.getPosicaoX() + " "  
                    + carroAtual.getPosicaoY() + " " + carroAtual.getVelocidade() + " " + carroAtual.getAceleracao(); 
    }
}