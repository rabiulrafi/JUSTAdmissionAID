package com.example.dell.justadmissionaid.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class Datebase extends SQLiteAssetHelper {

    private static final String DB_NAMAE="Admission.sqbpro";
    private static final int DB_VER=1;

    public Datebase(Context context) {
        super(context, DB_NAMAE, null, DB_VER);
    }
}
