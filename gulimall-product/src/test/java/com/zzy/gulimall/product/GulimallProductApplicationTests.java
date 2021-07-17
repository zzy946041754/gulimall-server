package com.zzy.gulimall.product;

import com.zzy.gulimall.product.entity.BrandEntity;
import com.zzy.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    private  BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = brandService.getById(13);
        brandEntity.setName("苹果");
        brandService.updateById(brandEntity);
    }

}
