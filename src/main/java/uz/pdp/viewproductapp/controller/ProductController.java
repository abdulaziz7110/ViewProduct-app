package uz.pdp.viewproductapp.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.pdp.viewproductapp.dao.ProductDao;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductDao productDao;

    public String getAllProduct(Model model){

        model.addAttribute("productList",productDao.getAllProduct());

        return "view-product";
    }

}
