package model;

public class MahasiwaDataView extends DataView<Mahasiswa> {
    @Override
    protected String getPrimaryKeyValue(Mahasiswa data) {
        return data.getNim();
    }

    @Override
    protected String[] getFields() {
        return new String[] { "nim", "nama", "email", "umur" };
    }

    @Override
    protected Mahasiswa convertValuesToModel(String[] values) {
        return new Mahasiswa(values[0], values[1], values[2], Integer.parseInt(values[3]));
    }

    @Override
    protected String[] convertModelToValues(Mahasiswa data) {
        return new String[] {
            data.getNim(),data.getNama(), data.getEmail(), String.valueOf(data.getUmur())
        };
    }


}
