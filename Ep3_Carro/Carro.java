public class Carro {
    
    //Atributos
    private String nome;
    private int direcao;
    private Motorista motoristaAtual;
    private int velocidade;
    private int aceleracao;
    private int posicaoX;
    private int posicaoY;
    private boolean movendo;
    private boolean praFrente;
    private boolean praTras;
    private int aceNFuncional;
    private boolean movendoAnteriormente;
    private boolean movendoAnteriormente2;
    
    // Construtores
    public Carro(String nome){
        this.nome = nome;
        this.direcao = 0;
        this.velocidade = 0;
        this.aceleracao = 0;
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.movendo = false;
        this.praFrente = true;
        this.praTras = false;
        this.aceNFuncional = 0;
        this.movendoAnteriormente = false;
        this.movendoAnteriormente2 = false;
    }
     
    public Carro(String nome, int posicaoX, int posicaoY){
        this.nome = nome;
        this.direcao = 0;
        this.velocidade = 0;
        this.aceleracao = 0;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.movendo = false;
        this.praFrente = true;
        this.praTras = false;
        this.aceNFuncional = 0;
        this.movendoAnteriormente = false;
        this.movendoAnteriormente2 = false;
    }

    // getters
    public String getNome() {               
        return nome;
    }
    
    public int getDirecao() {       
        return direcao;
    }
    
    public Motorista getMotoristaAtual() {
        return motoristaAtual;
    }
    
    public int getVelocidade() {            
        return velocidade;
    }
    
    public int getAceleracao() {            
        return aceleracao;
    }
    
    public int getPosicaoX() {              
        return posicaoX;
    }

    public int getPosicaoY() {             
        return posicaoY;
    }
    
    public boolean getMovendo(){        
        return movendo;
    }
    
    public boolean getPraTras() {           
        return praTras;
    }
    
    public boolean getPraFrente() {     
        return praFrente;
    }
    
    public int getAceNFuncional() {        
        return aceNFuncional;
    }
    
    public boolean getMovendoAnteriormente() {      
        return movendoAnteriormente;
    }
    
     public boolean getMovendoAnteriormente2() {
        return movendoAnteriormente2;
    }
    
    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDirecao(int direcao) {       
        this.direcao = direcao;
    }

    public void setMotoristaAtual(Motorista motoristaAtual) {
        this.motoristaAtual = motoristaAtual;
    }

    public void setVelocidade(int velocidade) {     
        this.velocidade = velocidade;
    }
    
    public void setAceleracao(int aceleracao) {     
        this.aceleracao = aceleracao;
    }

    public void setPosicaoX(int posicaoX) {     
        this.posicaoX = posicaoX;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
    
    public void setMovendo(boolean movendo){        
        this.movendo = movendo;
    }
    
    public void setPraFrente(boolean praFrente) {
        this.praFrente = praFrente;
    }

    public void setPraTras(boolean praTras) {       
        this.praTras = praTras;
    }

    public void setAceNFuncional(int aceNFuncional) {       
        this.aceNFuncional = aceNFuncional;
    }

    public void setMovendoAnteriormente(boolean movendoAnteriormente) { 
        this.movendoAnteriormente = movendoAnteriormente;
    }

    public void setMovendoAnteriormente2(boolean movendoAnteriormente2) {
        this.movendoAnteriormente2 = movendoAnteriormente2;
    }

    // Métodos
    public void mover(){
        setMovendo(true);
        
        if(getMovendoAnteriormente() == false){
            setAceleracao(getAceNFuncional());
            setMovendoAnteriormente(true);
        }
        
        if (motoristaAtual != null && getPraFrente() == true && getPraTras() == false){
            if(getDirecao() % 360 == 0){
                setVelocidade(getVelocidade() + getAceleracao());
                if(getVelocidade() <= 0){
                    setVelocidade(0);
                    setAceleracao(0);
                    setMovendo(false);
                    setMovendoAnteriormente(false);
                }
                setPosicaoX(getPosicaoX() + getVelocidade());
            }
            
            if(getDirecao() % 360 == 180 || getDirecao() % 360 == -180){
                setVelocidade(getVelocidade() + getAceleracao());
                if(getVelocidade() <= 0){
                    setVelocidade(0);
                    setAceleracao(0);
                    setMovendo(false);
                    setMovendoAnteriormente(false);
                }
                setPosicaoX(getPosicaoX() - getVelocidade());
            }
            
            if(getDirecao() % 360 == 90 || getDirecao() % 360 == -270){
                setVelocidade(getVelocidade() + getAceleracao());
                if(getVelocidade() <= 0){
                    setVelocidade(0);
                    setAceleracao(0);
                    setMovendo(false);
                    setMovendoAnteriormente(false);
                }
                setPosicaoY(getPosicaoY() + getVelocidade());
            }
            
            if(getDirecao() % 360 == -90 || getDirecao() % 360 == 270){
                setVelocidade(getVelocidade() + getAceleracao());
                if(getVelocidade() <= 0){
                    setVelocidade(0);
                    setAceleracao(0);
                    setMovendo(false);
                    setMovendoAnteriormente(false);
                }
                setPosicaoY(getPosicaoY() - getVelocidade());
            }
                
        }    
   
        if (motoristaAtual != null && getPraFrente() == false && getPraTras() == true){
            
            if(getDirecao() % 360 == 0){
                if(getMovendoAnteriormente2() == false){
                    setVelocidade(getVelocidade() + getAceleracao());
                    setVelocidade(-getVelocidade());
                    setMovendoAnteriormente2(true);
                }
                
                else
                    setVelocidade(getVelocidade() - getAceleracao());
                
                if(getVelocidade() >= 0){
                    setVelocidade(0);
                    setAceleracao(0);
                    setMovendo(false);
                    setMovendoAnteriormente(false);
                    setMovendoAnteriormente2(false);
                    //setPraFrente(true); caso todo mover seja para frente;
                    //setPraTras(false);
                }
                setPosicaoX(getPosicaoX() + getVelocidade());
            }

            if(getDirecao() % 360 == 180 || getDirecao() % 360 == -180){
                if(getMovendoAnteriormente2() == false){
                    setVelocidade(getVelocidade() + getAceleracao());
                    setVelocidade(-getVelocidade());
                    setMovendoAnteriormente2(true);
                }
                
                else
                    setVelocidade(getVelocidade() - getAceleracao());
                
                if(getVelocidade() >= 0){
                    setVelocidade(0);
                    setAceleracao(0);
                    setMovendo(false);
                    setMovendoAnteriormente(false);
                    setMovendoAnteriormente2(false);
                }
                setPosicaoX(getPosicaoX() - getVelocidade());
            }
            
            if(getDirecao() % 360 == 90 || getDirecao() % 360 == -270){
                if(getMovendoAnteriormente2() == false){
                    setVelocidade(getVelocidade() + getAceleracao());
                    setVelocidade(-getVelocidade());
                    setMovendoAnteriormente2(true);
                }
                
                else
                    setVelocidade(getVelocidade() - getAceleracao());
                
                if(getVelocidade() >= 0){
                    setVelocidade(0);
                    setAceleracao(0);
                    setMovendo(false);
                    setMovendoAnteriormente(false);
                    setMovendoAnteriormente2(false);
                }
                setPosicaoY(getPosicaoY() + getVelocidade());
            }
            
            if(getDirecao() % 360 == -90 || getDirecao() % 360 == 270){
                if(getMovendoAnteriormente2() == false){
                    setVelocidade(getVelocidade() + getAceleracao());
                    setVelocidade(-getVelocidade());
                    setMovendoAnteriormente2(true);
                }
                
                else
                    setVelocidade(getVelocidade() - getAceleracao());
                
                if(getVelocidade() >= 0){
                    setVelocidade(0);
                    setAceleracao(0);
                    setMovendo(false);
                    setMovendoAnteriormente(false);
                    setMovendoAnteriormente2(false);
                }
                setPosicaoY(getPosicaoY() - getVelocidade());
            }
                
        }
    }
    
    public void mover (boolean progressivo){
        if (velocidade == 0 && motoristaAtual != null && progressivo == true){
            setMovendo(true);
            setPraFrente(true);
            setPraTras(false);
            mover();
        }    
        else if (velocidade == 0 && motoristaAtual != null && progressivo == false){
            setMovendo(true);
            setPraFrente(false);
            setPraTras(true);
            mover();
        }
    }
    
    public void acelerar(int incremento){
        setMovendoAnteriormente(false);

        if(getMovendoAnteriormente() == false){
            setAceNFuncional(getAceleracao() + incremento);
        }
    }
    
    public void frear(int decremento){
        setMovendoAnteriormente(false);
        
        if(getMovendoAnteriormente() == false){
            setAceNFuncional(getAceleracao() - decremento);
        }
    }    
    
    public void virarAEsquerda(){
        setDirecao(getDirecao() + 90);
    }
    
    public void virarADireita(){
        setDirecao(getDirecao() - 90);
    }
    
    public String toString(){
        if(motoristaAtual == null)
            return this.nome + " " + getPosicaoX() + " "  + getPosicaoY() + " " +
                        getVelocidade() + " " + getAceleracao(); 
        else
            return this.nome + " (" + motoristaAtual.getNome() + ") " + getPosicaoX() + " "  
                        + getPosicaoY() + " " + getVelocidade() + " " + getAceleracao(); 
    }
   
}
