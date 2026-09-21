/**
 * Interface que todos os observadores devem implementar.
 */
public interface Observer {
    // Método que será chamado quando um novo dígito for adicionado
    void update(int newDigit);
}
