package com.huseyinaydin.sha.springbootproductseller.service;

import java.util.List;

import com.huseyinaydin.sha.springbootproductseller.model.Purchase;
import com.huseyinaydin.sha.springbootproductseller.repository.projection.PurchaseItem;

/**
 * @author Hüseyin Aydın
 * @date 18.12.2021
 * @time 12:37
 */
public interface PurchaseService
{
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
