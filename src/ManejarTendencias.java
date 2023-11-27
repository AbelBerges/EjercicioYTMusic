public class ManejarTendencias {
    private String dominio;
    private EstadoTendencia estado = null;

    public void esNormal(Cancion valor){
        estado = new Normal();
        estado.tendencia(valor);
    }

    public void estaEnAuge(Cancion valor){
        estado = new EnAuge();
        estado.tendencia(valor);
    }

    public void yaEstaFlama(Cancion valor){
        estado = new EstaFlama();
        estado.tendencia(valor);
    }
}
