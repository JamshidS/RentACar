package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstructs.BrandService;
import kodlama.io.rentACar.entities.concertes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Annotation
@RequestMapping("api/brands") //addressing
public class BrandsController {

    private BrandService brandService;
    @Autowired // surdaki constructor'un parametrelerine bak demek
    public  BrandsController(BrandService brandService){
        this.brandService=brandService;
    }
    @GetMapping("/getall")
    public List<Brand> getAll(){
        return brandService.getAll();
    }

}
