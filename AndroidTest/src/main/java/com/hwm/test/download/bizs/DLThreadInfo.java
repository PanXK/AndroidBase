package com.hwm.test.download.bizs;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName= DLCons.DBCons.TB_THREAD)
public class DLThreadInfo {

    @DatabaseField(generatedId = true)
    public int _id;
    @DatabaseField(columnName = DLCons.DBCons.TB_THREAD_ID)
    public String id;
    @DatabaseField(columnName = DLCons.DBCons.TB_THREAD_URL_BASE)
    public String baseUrl;
    @DatabaseField(columnName = DLCons.DBCons.TB_THREAD_START)
    public int start;
    @DatabaseField(columnName = DLCons.DBCons.TB_THREAD_END)
    public int end;
    public boolean isStop;

    public DLThreadInfo(){

    }

    public DLThreadInfo(String id, String baseUrl, int start, int end) {
        this.id = id;
        this.baseUrl = baseUrl;
        this.start = start;
        this.end = end;
    }
}