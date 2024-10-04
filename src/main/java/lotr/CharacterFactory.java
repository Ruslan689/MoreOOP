package lotr;
public class CharacterFactory {
    public Character createCharacter() {
        int random = (int) (Math.random() * 4);
        if (random == 0)
            return new Elf();

        if (random == 1)
            return new Hobbit();

        if (random == 2)
            return new King();

        return new Knight();
    }
}
