package pro.sky.basket.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
class BacketList {
    private final List<Integer> basketList = new ArrayList<>();
}
