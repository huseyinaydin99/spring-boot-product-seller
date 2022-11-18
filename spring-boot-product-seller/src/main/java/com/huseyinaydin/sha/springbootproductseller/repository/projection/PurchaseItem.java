package com.huseyinaydin.sha.springbootproductseller.repository.projection;

import java.time.LocalDateTime;

/**
 * @author Hüseyin Aydın
 * @date 18.12.2021
 * @time 12:14
 */
public interface PurchaseItem
{
    String getName();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
