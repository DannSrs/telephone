/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
        
        // Cria o primeiro observador: imprime apenas o dígito mais recente
        Observer observadorDigito = new Observer() {
            @Override
            public void update(int newDigit) {
                System.out.println(newDigit);
            }
        };
        
        // Cadastra o observador no modelo
        this.model.addObserver(observadorDigito);
    }
}
