// Clase hija Escudo
class Escudo extends Arma {
    public Escudo() {
        super("Escudo", 0); // El escudo no hace daño
    }
    
    @Override
    public int usar(Personaje atacante, Personaje defensor) {
        if (rand.nextDouble() < 0.5) { // 50% de probabilidad de bloquear el daño
            System.out.println(defensor.getNombre() + " bloquea el ataque con su escudo!");
            return 0;
        }
        System.out.println(atacante.getNombre() + " intenta atacar pero " + defensor.getNombre() + " no logra bloquear con su escudo.");
        return dano; // Retorna 0 ya que el escudo no hace daño
    }
}