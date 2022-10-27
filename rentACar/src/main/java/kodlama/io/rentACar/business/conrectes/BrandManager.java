package kodlama.io.rentACar.business.conrectes;

import kodlama.io.rentACar.business.abstructs.BrandService;
import kodlama.io.rentACar.dataAccess.abstructs.BrandRepository;
import kodlama.io.rentACar.entities.concertes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //bu sinif bir business nesnesidir
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    @Autowired
    public BrandManager(BrandRepository brandRepository){
        this.brandRepository=brandRepository;
    }
    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
