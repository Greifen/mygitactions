/**
 * Dieses Paket enthält die HelloWorld-Klasse.
 */
package mypackage;

/**
 * Die HelloWorld-Klasse enthält die main-Methode zum Ausgeben einer Nachricht.
 */
public class HelloWorld {

    // Privater Konstruktor, um Instanziierung zu verhindern
    private HelloWorld() {
        throw new UnsupportedOperationException("Diese Klasse sollte nicht instanziiert werden.");
    }

    /**
     * Die Hauptmethode gibt "Hello World!" auf der Konsole aus.
     *
     * @param args Die Kommandozeilenargumente (nicht verwendet).
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");
    }
}
