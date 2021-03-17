package com.skhu.skhuedIn.controller;


import com.skhu.skhuedIn.domain.Member;
import com.skhu.skhuedIn.domain.item.Item;
import com.skhu.skhuedIn.service.ItemService;
import com.skhu.skhuedIn.service.MemberService;
import com.skhu.skhuedIn.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final MemberService memberService;
    private final ItemService itemService;


    @GetMapping
    public String createForm(Model model) {
        List<Member> members = memberService.findMembers();
        List<Item> items = itemService.findItems();


        model.addAttribute("members", members);
        model.addAttribute("items", items);

        return "order/orderForm";


    }

    @PostMapping(value = "/order")
    public String order(@RequestParam("memberId") Long memberId,
                        @RequestParam("itemId") Long itemId, @RequestParam("count") int count) {
        orderService.order(memberId, itemId, count);
        return "redirect:/orders";
    }

}
