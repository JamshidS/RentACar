package kodlama.io.rentACar.dataAccess.abstructs;

import kodlama.io.rentACar.entities.concertes.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}
