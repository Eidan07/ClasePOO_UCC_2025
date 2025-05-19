// Clase hija Espada
class Espada extends Arma {
    public Espada() {
        super("Espada", 70); // Daño de la espada
    }
    
    @Override
    public int usar(Personaje atacante, Personaje defensor) {
        int danoReal = rand.nextInt(21) + dano - 10; // Daño entre 60-80
        System.out.println(atacante.getNombre() + " ataca con " + nombre + " a " + defensor.getNombre() + " causando " + danoReal + " puntos de daño.");
        return danoReal;
    }
}