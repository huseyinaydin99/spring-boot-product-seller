package com.huseyinaydin.sha.springbootproductseller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.huseyinaydin.sha.springbootproductseller.model.Purchase;
import com.huseyinaydin.sha.springbootproductseller.repository.projection.PurchaseItem;

import java.util.List;

/**
 * @author Hüseyin Aydın
 * @date 18.12.2021
 * @time 12:13
 */
public interface PurchaseRepository extends JpaRepository<Purchase, Long>
{
    @Query("select " +
            "prd.name as name, pur.price as price, pur.purchaseTime as purchaseTime " +
            "from Purchase pur left join Product prd on prd.id = pur.productId " +
            "where pur.userId = :userId")
    List<PurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);
}
