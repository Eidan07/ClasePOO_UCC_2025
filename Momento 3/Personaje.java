class Personaje {
    private String nombre;
    private int puntosDeVida;
    private final int BOLA_DE_FUEGO = 100; // Ataque especial
    private Espada espada; // Arma para causar daño
    private Escudo escudo; // Arma para bloquear el daño
    private boolean escudoActivo;
    
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 500; // los jugadores tienen 500 de vida cada uno
        this.espada = new Espada();
        this.escudo = new Escudo();
        this.escudoActivo = false;
    }

    public void atacar(Personaje oponente) {
        if (escudoActivo) {
            System.out.println(this.nombre + " no puede atacar porque tiene el escudo equipado");
            return;
        }
        int dano = espada.usar(this, oponente);
        oponente.recibirDano(dano);
    }

    public void activarEscudo() {
        this.escudoActivo = true;
        System.out.println(this.nombre + " equipa el escudo para el próximo ataque ");
    }

    public void desactivarEscudo() {
        this.escudoActivo = false;
    }

    public void bolaDeFuego(Personaje oponente) {
        if (escudoActivo) {
            System.out.println(this.nombre + " no puede lanzar bola de fuego con el escudo equipado ");
            return;
        }
        oponente.recibirDano(BOLA_DE_FUEGO);
        System.out.println(this.nombre + " lanza una BOLA DE FUEGO contra " + oponente.getNombre() + " causando " + BOLA_DE_FUEGO + " puntos de daño.");
    }

    public void recibirDano(int dano) {
        if (escudoActivo) {
            dano = escudo.usar(this, null); // El escudo puede bloquear el daño
            desactivarEscudo();
        }
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public boolean tieneEscudoActivo() {
        return escudoActivo;
    }
}