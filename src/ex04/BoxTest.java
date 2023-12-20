package ex04;

import org.w3c.dom.ls.LSOutput;

class Box{
    int width, height, depth;
}
public class BoxTest {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("상자의 크기: (" + b.width + "," + b.height + ","
                            +b.depth + ")");
    }


}
