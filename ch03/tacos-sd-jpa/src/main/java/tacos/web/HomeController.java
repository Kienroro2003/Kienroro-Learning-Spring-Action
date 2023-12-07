package tacos.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.Ingredient;
import tacos.TacoOrder;
import tacos.data.OrderRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private OrderRepository orderRepository;
    @ModelAttribute(name = "orders")
    public List<TacoOrder> addOrders(Model model) {
        List<TacoOrder> orders = new ArrayList<>();
        orderRepository.findAll().forEach(i -> orders.add(i));

        return orders;
    }

    @GetMapping
    public String showHome() {
        return "home";
    }
}
