package com.example.vishvendu.headlyapp.Dashboard.Presenter;

import com.example.vishvendu.headlyapp.Dashboard.Model.DashBoardModelImpl;
import com.example.vishvendu.headlyapp.Dashboard.Model.IDashBoardModel;
import com.example.vishvendu.headlyapp.Dashboard.View.IDashboardView;

/**
 * Created by vishvendu on 28/11/17.
 */

public class DashboardPresenterImpl implements IDashboardPresenter {


    IDashboardView iDashboardView;
    IDashBoardModel iDashBoardModel;

    public DashboardPresenterImpl(IDashboardView iDashboardView) {

        this.iDashboardView = iDashboardView;
        iDashBoardModel = new DashBoardModelImpl(this);
    }

    @Override
    public void fetchCategotyList() {

    }

    @Override
    public void fetchRanking() {

    }
}
