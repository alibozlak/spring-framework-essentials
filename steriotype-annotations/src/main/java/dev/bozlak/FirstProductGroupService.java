package dev.bozlak;

import org.springframework.stereotype.Service;

@Service
public class FirstProductGroupService implements ProductGroupService{

    private final ProductGroupRepository productGroupRepository;

    public FirstProductGroupService(ProductGroupRepository productGroupRepository) {
        this.productGroupRepository = productGroupRepository;
    }

    @Override
    public boolean deleteProductGroupById(int productGroupId) {
        System.out.println("Delete processing with FirstProductGroupService class in service layer");
        return productGroupRepository.deletedProductGroupById(productGroupId);
    }
}
