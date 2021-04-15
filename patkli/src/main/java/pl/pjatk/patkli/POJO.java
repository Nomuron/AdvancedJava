package pl.pjatk.patkli;

public class POJO {

    private int health;
    private int mana;
    private String name;
    private boolean dead;

    public POJO(int health, int mana, String name, boolean dead) {
        this.health = health;
        this.mana = mana;
        this.name = name;
        this.dead = dead;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public String getName() {
        return name;
    }

    public boolean isDead() {
        return dead;
    }
}
