package lotr;

public class Knight extends Character{

    public Knight(){
        this.power = (int) Math.random() * 11 + 2;
        this.hp = (int) Math.random() * 11 + 2;
    }

    public void kick(Character c) {
        System.out.println("oooooo king aaaaaa");
        }
}
