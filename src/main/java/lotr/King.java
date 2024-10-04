package lotr;

public class King extends Character{

    public King(){
        this.hp = (int) Math.random() * 11 + 5;
        this.power = (int) Math.random() * 11 + 5;
    }

    public void kick(Character c) { 
        c.hp -= power;
        // decrease number of hp of the enemy by random 
        // number which will be in the range of his power 
      }
}
