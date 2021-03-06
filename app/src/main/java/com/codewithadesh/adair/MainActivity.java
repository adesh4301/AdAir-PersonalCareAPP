package com.codewithadesh.adair;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.codewithadesh.adair.adapter.ProductAdapter;
import com.codewithadesh.adair.adapter.ProductCategoryAdapter;
import com.codewithadesh.adair.model.ProductCategory;
import com.codewithadesh.adair.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecycler,prodItemRecycler;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1,"Most Popular"));
        productCategoryList.add(new ProductCategory(2,"All body products"));
        productCategoryList.add(new ProductCategory(3,"Skin Care"));
        productCategoryList.add(new ProductCategory(4,"Hair"));

        setProductRecycler(productCategoryList);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1,"Japanese Cherry Blossom","250ml","$17.00",R.drawable.prod2));
        productsList.add(new Products(2,"African Mango Shower Gel","350ml","$20.00",R.drawable.prod1));
        productsList.add(new Products(1,"Japanese Cherry Blossom","250ml","$17.00",R.drawable.prod2));
        productsList.add(new Products(2,"African Mango Shower Gel","350ml","$20.00",R.drawable.prod1));
        productsList.add(new Products(1,"Japanese Cherry Blossom","250ml","$17.00",R.drawable.prod2));
        productsList.add(new Products(2,"African Mango Shower Gel","350ml","$20.00",R.drawable.prod1));

        setProdItemRecycler(productsList);

    }

    private void setProductRecycler(List<ProductCategory> productCategoryList){

        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this,productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);
    }

    private void setProdItemRecycler(List<Products> productsList){

        prodItemRecycler = findViewById(R.id.product_Recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        prodItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this,productsList);
        prodItemRecycler.setAdapter(productAdapter);
    }
}