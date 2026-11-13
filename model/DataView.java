package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

public abstract class DataView<T> {
    private List<T> DataList;

    public DataView() {
        this.DataList = new ArrayList<>();
    }

    public void printAll() {
        String [] fields = this.getFields();
        for ( int i =0; i < this.DataList.size(); i++) {
            T record this.DataList.get(i);
            String [] values = this.convertModelToValues(record);
            System.out.println(i+"");
            for ( int j = 0; j < fields.length; j++){
                System.out.println(fields[j]+ "="+ values[j]+", ");
            }
            System.out.println();
        }
    };

    public void printByPk(String primaryKey) {
        for (T data : DataList) {
            if (getPrimaryKeyValue(data).equals(primaryKey)) {
                String[] fields = this.getFields();
                String[] values = new String[fields.length];
                for (int j = 0; j < fields.length; j++) {
                    System.out.println(fields[j] + "=" + values[j] + ", ");
                }
            }

            System.out.println("Data dengan Primary Key '" + primaryKey + "' tidak ditemukan.");
        }

    };

    public void showInsertForm() {
        String[] fields = this.getFields();
        String[] values = new String[fields.length];

        for (int i = 0; i < fields.length; i++) {
            System.out.print("inputt " + fields[i] + ": ");
            values[i] = scanner.nextLine();
        }

        T newData = convertValuesToModel(values);
        Data.add(newData);
        System.out.println("Data berhasil ditambahkan.");
    };

    public void showUpdateForm() {
        String pk = scanner.next()
        for (int i = 0; i < DataList.size(); i++) {
            if (getPrimaryKeyValue(DataList.get(i).equals(pk)))
            System.out.print("inputt " + fields[i] + ": ");
            values[i] = scanner.nextLine();
        }
    };

    public void promptDelete() {
    };

    protected abstract String getPrimaryKeyValue(T data);

    protected abstract String[] getFields();

    protected abstract T convertValuesToModel(String[] values);

    protected abstract String[] convertModelToValues(T data);

}