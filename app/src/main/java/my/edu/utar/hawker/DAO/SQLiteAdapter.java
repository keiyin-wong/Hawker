package my.edu.utar.hawker.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import my.edu.utar.hawker.model.Hawker;
import my.edu.utar.hawker.utilities.InsertData;

public class SQLiteAdapter {

    public static final String MYDATABASE_NAME = "HAWKERS";
    public static final String MYDATABASE_TABLE = "myTable";
    public static final int MYDATABASE_VERSION = 1;
    public static final String KEY_CONTENT = "";
    public static final String[] columnName = {"address", "description", "displayPhoneNo", "isOpen", "favourites", "name", "phone", "recommends", "userReview", "previousWeekOpeningHours", "pictureName"};
    private static final String SCRIPT_CREATE_DATABASE = "create TABLE myTable (address TEXT, description TEXT, displayPhoneNo Text, isOpen Text, favourites int, name text not NULL, phone text, recommends int, userReview text, previousWeekOpeningHours Text, pictureName Text);";

    private Context context;
    private SQLiteHelper sqLiteHelper;
    private SQLiteDatabase sqLiteDatabase;

    public SQLiteAdapter() {
    }

    public SQLiteAdapter(Context c) {
        context = c;
    }

    public SQLiteAdapter openToRead() throws SQLException {
        sqLiteHelper = new SQLiteHelper(context, MYDATABASE_NAME, null, MYDATABASE_VERSION);
        sqLiteDatabase = sqLiteHelper.getReadableDatabase();
        return this;
    }

    public SQLiteAdapter openToWrite() throws SQLException {
        sqLiteHelper = new SQLiteHelper(context, MYDATABASE_NAME, null, MYDATABASE_VERSION);
        sqLiteDatabase = sqLiteHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        sqLiteHelper.close();
    }

    public long insert(Hawker hawker) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(columnName[0], hawker.getAddress());
        contentValues.put(columnName[1], hawker.getDescription());
        contentValues.put(columnName[2], hawker.isDisplayPhoneNoString());
        contentValues.put(columnName[3], hawker.isOpenString());
        contentValues.put(columnName[4], hawker.getFavourites());
        contentValues.put(columnName[5], hawker.getName());
        contentValues.put(columnName[6], hawker.getPhone());
        contentValues.put(columnName[7], hawker.getRecommends());
        contentValues.put(columnName[8], hawker.getUserReview());
        contentValues.put(columnName[9], hawker.getPreviousWeekOpeningHours());
        contentValues.put(columnName[10], hawker.getPictureName());

        return sqLiteDatabase.insert(MYDATABASE_TABLE, null, contentValues);
    }

    public int deleteAll() {
        return sqLiteDatabase.delete(MYDATABASE_TABLE, null, null);
    }

    public ArrayList<Hawker> queryAll() {
        String[] columns = columnName;
        ArrayList<Hawker> hawkerList = new ArrayList<Hawker>();
        int indexContent[] = new int[columnName.length];

        Cursor cursor = sqLiteDatabase.query(MYDATABASE_TABLE, columns, null, null, null, null, null);
        return queryByCursor(cursor);
    }

    public ArrayList<Hawker> queryByCursor(Cursor cursor) {
        ArrayList<Hawker> hawkerList = new ArrayList<Hawker>();
        int indexContent[] = new int[columnName.length];

        for (int i = 0; i < indexContent.length; i++) {
            indexContent[i] = cursor.getColumnIndex(columnName[i]);
        }

        for (cursor.moveToFirst(); !(cursor.isAfterLast());
             cursor.moveToNext()) {
            Hawker hawker = new Hawker();
            hawker.setAddress(cursor.getString(indexContent[0]));
            hawker.setDescription(cursor.getString(indexContent[1]));
            hawker.setDisplayPhoneNo(cursor.getString(indexContent[2]));
            hawker.setOpen(cursor.getString(indexContent[3]));
            hawker.setFavourites(cursor.getInt(indexContent[4]));
            hawker.setName(cursor.getString(indexContent[5]));
            hawker.setPhone(cursor.getString(indexContent[6]));
            hawker.setRecommends(cursor.getInt(indexContent[7]));
            hawker.setUserReview(cursor.getString(indexContent[8]));
            hawker.setPreviousWeekOpeningHours(cursor.getString(indexContent[9]));
            hawker.setPictureName(cursor.getString(indexContent[10]));
            hawkerList.add(hawker);
        }
        return hawkerList;

    }

    public ArrayList<Hawker> querySearchName(String pattern) {
        String[] columns = columnName;
        String patterLower = pattern.toLowerCase();
        Cursor cursor = sqLiteDatabase.query(MYDATABASE_TABLE, columns, "lower(" + columns[5] + ") like '%" + patterLower + "%'", null, null, null, null);
        return queryByCursor(cursor);
    }

    public ArrayList<Hawker> querySortByRecommend() {
        String[] columns = columnName;
        Cursor cursor = sqLiteDatabase.query(MYDATABASE_TABLE, columns, null, null, null, null, columnName[7] + " DESC");
        return queryByCursor(cursor);

    }

    public ArrayList<Hawker> querySortByName() {
        String[] columns = columnName;
        Cursor cursor = sqLiteDatabase.query(MYDATABASE_TABLE, columns, null, null, null, null, columnName[5] + " ASC");
        return queryByCursor(cursor);
    }


    public class SQLiteHelper extends SQLiteOpenHelper {


        public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(SCRIPT_CREATE_DATABASE);
            System.out.println("MyFirstTime");
            ArrayList<Hawker> hawkerList = InsertData.insertData();

            for (int i = 0; i < hawkerList.size(); i++) {
                insertData(hawkerList.get(i), sqLiteDatabase);
            }

        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL(SCRIPT_CREATE_DATABASE);
        }

        public void insertData(Hawker hawker, SQLiteDatabase sqLiteDatabase) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(columnName[0], hawker.getAddress());
            contentValues.put(columnName[1], hawker.getDescription());
            contentValues.put(columnName[2], hawker.isDisplayPhoneNoString());
            contentValues.put(columnName[3], hawker.isOpenString());
            contentValues.put(columnName[4], hawker.getFavourites());
            contentValues.put(columnName[5], hawker.getName());
            contentValues.put(columnName[6], hawker.getPhone());
            contentValues.put(columnName[7], hawker.getRecommends());
            contentValues.put(columnName[8], hawker.getUserReview());
            contentValues.put(columnName[9], hawker.getPreviousWeekOpeningHours());
            contentValues.put(columnName[10], hawker.getPictureName());

            sqLiteDatabase.insert(MYDATABASE_TABLE, null, contentValues);
        }


    }


}
