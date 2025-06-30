public class PlayerCharacter {

    public static int x = 0;
    public static int y = 0;

    public static int getX(){
        return x;
    }

    public static int getY(){
        return y;
    }

    public static int[] moveW(){
        y += 1;
        return new int[] {getX(), getY()};
    }

    public static int[] moveS(){
        y -= 1;
        return new int[] {getX(), getY()};
    }

    public static int[] moveD(){
        x += 1;
        return new int[] {getX(), getY()};
    }

    public static int[] moveA(){
        x -= 1;
        return new int[] {getX(), getY()};
    }
}
