package exeption;

public class CaixaException extends Exception{
    private String codigoExecao;

    public CaixaException(String codigoExccao){
        this.codigoExecao = codigoExccao;
    }

    @Override
    public String getMessage() {
        String erro = "";
        if(codigoExecao.equals("RF01EX01")){
            erro = "Valor invalido para deposito!";
        }else if(codigoExecao.equals("RF01EX02")){
            erro = "Sem saldo suficiente para o saque!";
        }
        return erro;
    }
}
