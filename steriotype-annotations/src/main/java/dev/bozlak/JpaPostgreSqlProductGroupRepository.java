package dev.bozlak;

import org.springframework.stereotype.Repository;

@Repository
public class JpaPostgreSqlProductGroupRepository implements ProductGroupRepository {
    @Override
    public boolean deletedProductGroupById(int productGroupId) {
        System.out.println("Deleted " + productGroupId + " ID product from Postgre database with Jpa technology");
        return true;
    }
}
