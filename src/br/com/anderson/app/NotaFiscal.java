package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class NotaFiscal implements Imprimivel, EnviavelPorEmail {

    private int numero;

    /**
     * 
     * @param numero 
     */
    public NotaFiscal(int numero) {
        this.numero = numero;
    }

    /**
     * 
     */
    @Override
    public void imprimir() {      
        System.out.println("Vamos imprimir essa nota fiscal de numero: " + numero);
    }

    /**
     * 
     * @param email 
     */
    @Override
    public void enviar(String email) {
        System.out.println("Enviando a nota de número: " + numero + " para o email: " + email);
    }
}
