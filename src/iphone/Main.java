package iphone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone("iPhone 15 Pro", "iOS 17");

        // Testando Reprodutor Musical
        System.out.println("=== REPRODUTOR MUSICAL ===");
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        System.out.println("\n=== APARELHO TELEFÔNICO ===");
        meuIphone.ligar("(11) 98765-4321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        System.out.println("\n=== NAVEGADOR INTERNET ===");
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}