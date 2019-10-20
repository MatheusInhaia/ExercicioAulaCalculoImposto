package Persistencia;

import java.util.ArrayList;

public class RelacaoDePessoas {

    private static final ArrayList<PessoaImposto> lista = new ArrayList<>();

    public static final boolean adicionar(PessoaImposto p){
        if(p!=null){
            lista.add(p);
            return true;
        }else{
            return false;
        }
    }

    public static final ArrayList<PessoaImposto> listarContas(){
        return new ArrayList<>(lista);
    }

}
