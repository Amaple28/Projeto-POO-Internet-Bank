package br.newtonpaiva;

public interface ContaRepository {
    public Conta findByNumber(Integer number);
    public void save(Conta conta);
    public void close(Integer number);
}
