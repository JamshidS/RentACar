package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstructs.BrandRepository;
import kodlama.io.rentACar.entities.concertes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository //bu sinif bir dataAccess nesnesidir
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;


    public InMemoryBrandRepository(){
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Mercedes"));
        brands.add(new Brand(3,"Audi"));
        brands.add(new Brand(4,"Range Rover"));
    }
    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
