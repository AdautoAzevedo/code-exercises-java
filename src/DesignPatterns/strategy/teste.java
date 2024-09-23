package DesignPatterns.strategy;

public class teste {
    public static void main(String[] args) {
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

    }
}
