package lotr;

import lombok.Getter;

@Getter
public abstract class Character {
    private int power;
    private int hp;

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    public abstract void kick(Character c);

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
