package com.cn.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@DynamicUpdate
@Data

/**
 * 商品种类
 */
public class ProductCategory {

    /** 种类id */
    @Id
    @GeneratedValue

    private Integer categoryId;

    /** 种类名称 */
    private String categoryName;

    /**B种类编号 */
    private Integer categoryType;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    public ProductCategory() {
    }
}

