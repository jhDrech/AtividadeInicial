package atividade;

public class FuncionarioComissionado extends Funcionario{
    private double Bonus;
    private double percentualComissao;

    public double getVendasMensais(){

    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}