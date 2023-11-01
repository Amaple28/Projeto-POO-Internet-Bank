package br.newtonpaiva;

public class HomeScreen {
    public static void main(String[] args) {
        var c01 = new Conta(999);
        System.out.println(c01);

        //c01.setNumero(999);
        c01.depositar(100.90);
//        c01.numero = 999;
//        c01.saldo = 100.90;


        var saldo = c01.sacar(10.90);

        System.out.println(
                String.format("Conta %d. Saldo é: %.2f",
                        c01.getNumero(),
                        saldo)
        );

        saldo = c01.depositar(50.0);

        System.out.println(
                String.format("Saldo é: %.2f", saldo)
        );


        ContaRepository repo = new ContaMongoDB();

        repo.findByNumber(100);
        repo.save(c01);
//        repo.close(c01);


//        var c02 = new Conta();
//        c02.numero = 1000;
//        c02.saldo = 1000.88;

    }
}
