import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Arena {
    private int width;
    private int height;
    private Hero hero;


    public  Arena(int width, int height){
        this.width = width;
        this.height = height;
        hero = new Hero(new Position(10,10));
    }

    public  void draw(Screen screen){
        hero.draw(screen);

    }

    public void processKey(KeyStroke key){

        if(key.getKeyType() == KeyType.ArrowUp){
            moveHero(hero.moveUp());
        }
        else if(key.getKeyType() == KeyType.ArrowDown){
            moveHero(hero.moveDown());
        }
        else if(key.getKeyType() == KeyType.ArrowLeft){
            moveHero(hero.moveLeft());
        }
        else if(key.getKeyType() == KeyType.ArrowRight) {
            moveHero(hero.moveRight());
        }
        System.out.println(key);
    }
    private void moveHero(Position position) {
        if(canMoveHero(position)){
            hero.setPosition(position);
        }

    }
    private boolean canMoveHero(Position position){
        if((position.getX()>=0 && position.getX()<width)&&(position.getY()>=0 && position.getY()<height)){
            return true;
        }
        return false;
    }

}
