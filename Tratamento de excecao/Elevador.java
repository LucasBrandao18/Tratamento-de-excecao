//definição das exceções 
class CapacidadeExcedidaException extends Exception {
    public CapacidadeExcedidaException(String mensagem) {
        super(mensagem);
    }
}

class LimiteSuperiorExcedidoException extends Exception {
    public LimiteSuperiorExcedidoException(String mensagem) {
        super(mensagem);
    }
}

class LimiteInferiorExcedidoException extends Exception {
    public LimiteInferiorExcedidoException(String mensagem) {
        super(mensagem);
    }
}

//classe elevador
class Elevador {
    private int andarAtual;
    private double pesoAtual;
    private final double capacidadeMaxima;
    private final int andarMinimo;
    private final int andarMaximo;

    public Elevador(double capacidadeMaxima, int andarMinimo, int andarMaximo) {
        this.andarAtual = andarMinimo;
        this.pesoAtual = 0;
        this.capacidadeMaxima = capacidadeMaxima;
        this.andarMinimo = andarMinimo;
        this.andarMaximo = andarMaximo;
    }

    public void entrar(double peso) throws CapacidadeExcedidaException {
        if (pesoAtual + peso > capacidadeMaxima) {
            throw new CapacidadeExcedidaException("Capacidade máxima do elevador excedida.");
        }
        pesoAtual += peso;
    }

    public void sair(double peso) {
        if (pesoAtual - peso >= 0) {
            pesoAtual -= peso;
        }
    }

    public void subir() throws LimiteSuperiorExcedidoException {
        if (andarAtual >= andarMaximo) {
            throw new LimiteSuperiorExcedidoException("O elevador já está no andar mais alto.");
        }
        andarAtual++;
    }

    public void descer() throws LimiteInferiorExcedidoException {
        if (andarAtual <= andarMinimo) {
            throw new LimiteInferiorExcedidoException("O elevador já está no andar mais baixo.");
        }
        andarAtual--;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }
}
