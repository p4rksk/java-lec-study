package Coffee;

import java.util.List;

public class Menu {
    private List<String>item;


    //아메리카노, 카푸치노, 마끼야또, 에스프레소 -여기서는 지금 컴퍼지션으로 만들면되는데
    //(아메리카노,1000) 카푸치노, 마끼야또, 에스프레소 -커스텀 자료형으로 해결한다.

    public Menu(List<String> item) {
        this.item = item;
    }
}
