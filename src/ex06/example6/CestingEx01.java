package ex06.example6;

class Protoss{

}

class Zealot extends Protoss{
    public void attack(){
        System.out.println("질럿이 공격합니다.");
    }
}

class Dragoon extends Protoss {
    public void attack(){
        System.out.println("드라군이 공격합니다.");
    }
}


public class CestingEx01 {
    public static void start(Protoss p){
        if(p instanceof Zealot){ //타입검사
            Zealot u = (Zealot) p; // 부모를 자식에 대입 못한다.
            u.attack();
        }
        if(p instanceof Dragoon){
            Dragoon u = (Dragoon) p;
            u.attack();
        }


    }
    public static void main(String[] args) {


        start(new Zealot());
        start(new Dragoon());
    }
}
