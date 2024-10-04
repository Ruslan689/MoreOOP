package lotr;

public class Hobbit extends Character{

    public Hobbit(){
        this.hp = 3;
        this.power = 0;
    }

    public static void toCry(){
        System.out.println("blin");
    }

    public void kick(Character c) { toCry(); }

    @Override
    public String toString(){
        return "Hobbit" + super.toString();
    }

}
