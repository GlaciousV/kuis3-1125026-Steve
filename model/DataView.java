package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class DataView<T> {
    private List<T> DataList;

    public DataView() {
        this.DataList = new ArrayList<>();
    }

    public void printAll() {
        String [] fields = this.getFields();
        String [] values = this.convertModelToValues(record);
        System.out.println(i+);
    };

    public void printByPk(String primaryKey) {
        for (T data : DataList) {
        
            }
        }
        System.out.println("Data dengan Primary Key '" + primaryKey + "' tidak ditemukan.");
    }

    };

    public void showInsertForm() {
    };

    public void showUpdateForm() {
    };

    public void promptDelete() {
    };

    protected abstract String getPrimaryKeyValue(T data);

    protected abstract String[] getFields();

    protected abstract T convertValuesToModel(String[] values);

    protected abstract String[] convertModelToValues(T data);

}