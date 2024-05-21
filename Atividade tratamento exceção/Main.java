//Você foi contratado para desenvolver um software de controle de elevador para um prédio comercial. Os elevadores devem ser capazes de se movimentar entre os andares, transportar as pessoas e controlar o peso total de ocupação. As implementações devem garantir que os elevadores não ultrapassem os limites de peso e o limite de pisos do edifício. 

public class Main {
    public static void main(String[] args) {
        try {
            Elevador elevador = new Elevador(500, 0, 10); //Capacidade de 500kg, do andar 0 ao 10 andar

            elevador.entrar(70);
            elevador.entrar(80);
            elevador.subir();
            elevador.subir();
            elevador.descer();
            elevador.sair(70);

            //Tentando exceder a capacidade
            elevador.entrar(400); 
            elevador.subir();
            elevador.subir();
            elevador.subir(); 
        } catch (CapacidadeExcedidaException e) {
            System.out.println(e.getMessage());
        } catch (LimiteSuperiorExcedidoException e) {
            System.out.println(e.getMessage());
        } catch (LimiteInferiorExcedidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
