package lotr;
public abstract class Character {

    public int power;
    public int hp;

    public abstract void kick(Character c);

    public boolean isAlive(){
        return hp > 0;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public void setHp(int hp) {
        if (hp < 0)
            this.hp = 0;
        else
            this.hp = hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString(){
        
        return "{hp=" + this.hp + ", power=" + this.power + "}";
    }
}
