package com.example.vishvendu.headlyapp.Database;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;
import org.greenrobot.greendao.DaoException;

/**
 * Created by vishvendu on 27/11/17.
 */

@Entity
public class Category {


    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "CATEGORY_ID")
    private Long categoryID;

    @Property(nameInDb = "CATEGORY_NAME")
    private String categoryName;

    @ToMany(referencedJoinProperty = "subCategoryID")
    private List<SubCategory> subCategoryID;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 40161530)
    private transient CategoryDao myDao;

    @Generated(hash = 971372689)
    public Category(Long id, Long categoryID, String categoryName) {
        this.id = id;
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

    @Generated(hash = 1150634039)
    public Category() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryID() {
        return this.categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 826935634)
    public List<SubCategory> getSubCategoryID() {
        if (subCategoryID == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SubCategoryDao targetDao = daoSession.getSubCategoryDao();
            List<SubCategory> subCategoryIDNew = targetDao
                    ._queryCategory_SubCategoryID(id);
            synchronized (this) {
                if (subCategoryID == null) {
                    subCategoryID = subCategoryIDNew;
                }
            }
        }
        return subCategoryID;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 1696299129)
    public synchronized void resetSubCategoryID() {
        subCategoryID = null;
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 503476761)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getCategoryDao() : null;
    }







    
}
