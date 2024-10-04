package lotr;

public class GameManager {
    void fight(Character c1, Character c2) { 
        // to provide fight between to characters and explain via command 
        // line what happens during fight, till both of 
        // the characters are alive
        int i = 0;
        while (c1.isAlive() && c2.isAlive()) {
            if (i % 2 == 0){
                c1.kick(c2);
                System.out.println(c1.getClass().getSimpleName() + " brutaly kick " + c2.getClass().getSimpleName());
            }
            else{
                c2.kick(c1);
                System.out.println(c2.getClass().getSimpleName() + " easily kick " + c1.getClass().getSimpleName());
            }
            i++;
        }
        if (c1.isAlive())
            System.out.print(c1.getClass().getSimpleName());
        else
            System.out.print(c2.getClass().getSimpleName());
        System.out.println("win the battle");
      }

}
