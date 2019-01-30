package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Main {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        Imprimivel im = new NotaFiscal(7);        
        im.imprimir();
        
        EnviavelPorEmail en = new NotaFiscal(9);        
        en.enviar("anderson@bol.com.br");         
        
        NotaFiscal n = new NotaFiscal(33);        
        n.imprimir();
        n.enviar("alves@bol.com.br");         
    }    
}
