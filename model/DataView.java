package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class DataView <T>  implements List<T> {
    private  List<T> DataList;
    public DataView() {
        this.DataList = new ArrayList<>();
    }
    public void printAll(){
        PrintUtil.printList(DataList);
    };
    public void printByPk(String primaryKey){};
    public void showInsertForm (){};
    public void showUpdateForm (){};
    public void promptDelete (){};
    protected abstract String getPrimaryKeyValue(T data);
    protected abstract String[] getFields();
    protected abstract T convertValuesToModel(String[] values);


}
