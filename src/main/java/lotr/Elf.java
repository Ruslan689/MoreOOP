package lotr;

public class Elf extends Character{

    public Elf(){
      this.hp = 10;
      this.power = 10;
    }

    public void kick(Character c) {
        if (power < c.power)
            c.power --;
        else
            c.hp = 0;
        // kill everybody weaker than him, 
        // otherwise decrease the power of character by 1 
      }

    @Override
    public String toString(){
      return "Elf" + super.toString();
    }
    
}
