package com.example.vishvendu.headlyapp.Database;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by vishvendu on 27/11/17.
 */

@Entity(nameInDb = "SUB_CATEGORY")
public class SubCategory {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "SUB_CATEGORY_ID")
    private  Long subCategoryID;

    @Property(nameInDb = "SUB_CATEGORY_NAME")
    private String subCategoryName;

    @Property(nameInDb = "SUB_CATEGORY_ADDED_DATE")
    private Long subCategoryAddedDate;

    @Generated(hash = 1796885557)
    public SubCategory(Long id, Long subCategoryID, String subCategoryName,
            Long subCategoryAddedDate) {
        this.id = id;
        this.subCategoryID = subCategoryID;
        this.subCategoryName = subCategoryName;
        this.subCategoryAddedDate = subCategoryAddedDate;
    }

    @Generated(hash = 1008922175)
    public SubCategory() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubCategoryID() {
        return this.subCategoryID;
    }

    public void setSubCategoryID(Long subCategoryID) {
        this.subCategoryID = subCategoryID;
    }

    public String getSubCategoryName() {
        return this.subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public Long getSubCategoryAddedDate() {
        return this.subCategoryAddedDate;
    }

    public void setSubCategoryAddedDate(Long subCategoryAddedDate) {
        this.subCategoryAddedDate = subCategoryAddedDate;
    }





}
