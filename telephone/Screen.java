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
        this.model.addObserver(observadorDigito);

        // Cria o segundo observador: imprime "Agora discando..." ao final
        Observer observadorDiscagem = new Observer() {
            @Override
            public void update(int newDigit) {
                // Checa se o número de telefone já atingiu 12 dígitos
                if (model.getDigits().size() == 12) {
                    System.out.print("Agora discando ");
                    // Varre a lista de dígitos para imprimir tudo na mesma linha
                    for (int digito : model.getDigits()) {
                        System.out.print(digito);
                    }
                    System.out.println("...");
                }
            }
        };
        this.model.addObserver(observadorDiscagem);
    }
}
