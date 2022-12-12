package com.study.springboot202210lee.product;

import com.study.springboot202210lee.wep.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class productController {
    @GetMapping("/product/addition")
    public String loadAddition(){
        return "product/product_add";
    }
//    @GetMapping("/api/product")
//    public String registerProduct(HttpServletRequest request){
//        System.out.println(request.getParameter("price"));
//
//        return "/product/product_view";
//    }



//    @GetMapping("/api/product")
//    public String registerProduct(@RequestParam String productCode,
//                                  @RequestParam String productName,
//                                  @RequestParam("price") int p,
//                                  @RequestParam int stork){
//
//        System.out.println(productCode);
//        System.out.println(productName);
//        System.out.println(p);
//        System.out.println(stork);
//
//        return "product/product_view";
//    }



    @GetMapping("/api/product")
    public String registerProduct(Model model, ProductDto productDto){
        model.addAttribute("productDto", productDto);
        System.out.println(productDto);
        return "product/product_view";
    }

    @GetMapping("/product/addition/2")
    public String loadAddition2(){
        return "product/product_add2";
    }

    @ResponseBody
    @GetMapping("/api/product/2")
    public String registerProduct(ProductDto productDto){
        System.out.println(productDto);
        return "텍스트 데이터 응답";
    }

}
