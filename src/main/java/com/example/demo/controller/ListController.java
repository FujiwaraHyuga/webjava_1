package com.example.demo.controller;

import java.util.HashMap;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.Com_name_Form;

@Controller  // Viewあり。Viewを返却するアノテーション
public class ListController {

  @RequestMapping(value="/item_list")          // URLとのマッピング
  public String show(HttpSession session, Model model){
    // Viewに渡すデータを設定
    HashMap<String, Integer> item_list =new HashMap<String, Integer>();
    item_list.put("リンゴ",100);
    item_list.put("バナナ",100);
    item_list.put("ブドウ",100);
    item_list.put("みかん",100);
    model.addAttribute("item_list",item_list);

    return "item_list";
  }


  @PostMapping("/list")
  public String cart(@ModelAttribute("com_name_Form") Com_name_Form name) {
      return "item_list";
  }


}