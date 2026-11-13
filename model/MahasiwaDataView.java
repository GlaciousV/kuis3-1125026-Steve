package model;

public class MahasiwaDataView extends DataView<Mahasiswa>{
    @Override
    protected String getPrimaryKeyValue(Mahasiswa data) {
        return null;
    }
    @Override
    protected String[] getFields() {
        return null;
    }
    @Override
    protected Mahasiswa convertValuesToModel(String[] values) {
        return null;
    }

    
}
