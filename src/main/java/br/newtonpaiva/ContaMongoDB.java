package br.newtonpaiva;

public class ContaMongoDB implements ContaRepository{
    @Override
    public Conta findByNumber(Integer number) {
        return null;
    }

    @Override
    public void save(Conta conta) {

    }

    @Override
    public void close(Integer number) {

    }
}
