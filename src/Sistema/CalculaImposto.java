package Sistema;


import java.math.BigDecimal;

public class CalculaImposto {

    private PessoaFisica pessoa;
    public CalculaImposto(PessoaFisica pessoa){
        this.pessoa = pessoa;
    }

    public BigDecimal baseCalculo(){
        BigDecimal auxiliarBaseImposto = new BigDecimal(0.0);
        auxiliarBaseImposto = (pessoa.getTotalRendimentos()).subtract(pessoa.getContribuicaoPrevidenciariaOficial());
        auxiliarBaseImposto = auxiliarBaseImposto.multiply(new BigDecimal(0.95));
        return auxiliarBaseImposto;
    }

    public BigDecimal calculoSimplificado(){
        return valorAPagar(new BigDecimal(1.0));
    }

    public BigDecimal calculoCompleto(){
        return valorAPagar(verificarPorcentagemDeDesconto());
    }

    public BigDecimal valorAPagar(BigDecimal desconto){
        BigDecimal valor= new BigDecimal(0.0);
        BigDecimal aux = new BigDecimal(1800.0);
        BigDecimal valorDaBase = baseCalculo().multiply(desconto);
        if(valorDaBase.compareTo(new BigDecimal(12000.0))==-1){

           valor = new BigDecimal( 0.0);
           return valor;
        }else if(valorDaBase.compareTo(new BigDecimal(12000.0))==1 && valorDaBase.compareTo(new BigDecimal(24000.0))==-1){

            valor = (valorDaBase.subtract(new BigDecimal(12000.0))).multiply(new BigDecimal(0.15));
            return valor;
        }else{

            valor = ((valorDaBase.subtract(new BigDecimal(24000.0))).multiply(new BigDecimal(0.275))).add(aux);
            return valor;
        }

    }



    public BigDecimal verificarPorcentagemDeDesconto(){
        BigDecimal porcentagemDesconto = new BigDecimal(0.0);
        if(pessoa.getIdade()<65){
            if(pessoa.getNumeroDependentes()<= 2){
                porcentagemDesconto = new BigDecimal(0.98);
            }else if(pessoa.getNumeroDependentes()>2 && pessoa.getNumeroDependentes()<6){
                porcentagemDesconto = new BigDecimal(0.965);
            }else{
                porcentagemDesconto = new BigDecimal(0.95);
            }
        }else{
            if(pessoa.getNumeroDependentes()<= 2){
                porcentagemDesconto = new BigDecimal(0.97);
            }else if(pessoa.getNumeroDependentes()>2 && pessoa.getNumeroDependentes()<6){
                porcentagemDesconto = new BigDecimal(0.955);
            }else{
                porcentagemDesconto = new BigDecimal(0.94);
            }

        }
        return porcentagemDesconto;
    }
}
