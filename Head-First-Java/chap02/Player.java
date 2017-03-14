package chap02;

/**
 * Created by fushanshan on 16/1/18.
 */
public class Player {
    int number = 0;
    public void guess(){
        number = (int)(Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
