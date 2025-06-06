package com.lukman.onlineshop.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.lukman.onlineshop.Domain.BannerModel;
import com.lukman.onlineshop.Domain.CategoryModel;
import com.lukman.onlineshop.Domain.ItemsModel;
import com.lukman.onlineshop.Repository.MainRepository;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {

    private final MainRepository repository = new MainRepository();

    public LiveData<ArrayList<CategoryModel>> loadCategory() {
        return repository.loadCategory();
    }

    public LiveData<ArrayList<BannerModel>> loadBanner() {
        return repository.loadBanner();
    }

    public LiveData<ArrayList<ItemsModel>> loadPopular() {
        return repository.loadPopular();
    }


}
