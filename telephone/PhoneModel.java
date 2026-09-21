import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    
    // Lista para guardar os observadores
    private List<Observer> observers = new ArrayList<>();

    // Método para permitir que a Screen adicione observadores
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        
        // Avisar a todos os observadores que um novo dígito chegou!
        for (Observer observer : observers) {
            observer.update(newDigit);
        }
    }

    public List<Integer> getDigits() {
        return digits;
    }
}
