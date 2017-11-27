package com.example.vishvendu.headlyapp.Database;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.vishvendu.headlyapp.Database.SubCategory;
import com.example.vishvendu.headlyapp.Database.Category;

import com.example.vishvendu.headlyapp.Database.SubCategoryDao;
import com.example.vishvendu.headlyapp.Database.CategoryDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig subCategoryDaoConfig;
    private final DaoConfig categoryDaoConfig;

    private final SubCategoryDao subCategoryDao;
    private final CategoryDao categoryDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        subCategoryDaoConfig = daoConfigMap.get(SubCategoryDao.class).clone();
        subCategoryDaoConfig.initIdentityScope(type);

        categoryDaoConfig = daoConfigMap.get(CategoryDao.class).clone();
        categoryDaoConfig.initIdentityScope(type);

        subCategoryDao = new SubCategoryDao(subCategoryDaoConfig, this);
        categoryDao = new CategoryDao(categoryDaoConfig, this);

        registerDao(SubCategory.class, subCategoryDao);
        registerDao(Category.class, categoryDao);
    }
    
    public void clear() {
        subCategoryDaoConfig.clearIdentityScope();
        categoryDaoConfig.clearIdentityScope();
    }

    public SubCategoryDao getSubCategoryDao() {
        return subCategoryDao;
    }

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

}