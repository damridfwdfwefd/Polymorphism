import compiletime.New;
import runtime.Next;

public  class Main {
    public static void main(String[] args) {


        New newInstance1 = new New();
        New newInstance2 = new New(a:1,b:2,c:3);
        New newInstance3 = new New(a:0.1f, b:0.2f, c:0.3f);
        New newInstance4 = new New(a:"1", b"2", c"3");

        // полиморфизм рантайма основывается на двух принципах:
        // 1. ссылочная переменная суперкласса (родительского) ссылается
        //  на любой обьект наследник (подкласс)
        // 2.
    }
}