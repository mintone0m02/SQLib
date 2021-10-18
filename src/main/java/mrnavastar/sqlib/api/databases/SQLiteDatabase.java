package mrnavastar.sqlib.api.databases;

import mrnavastar.sqlib.util.SqlManager;

public class SQLiteDatabase extends Database{

    private final String directory;

    public SQLiteDatabase(String name, String directory) {
        super(name);
        this.directory = directory;
        this.connect();
        this.disconnect();
    }

    @Override
    public void connect() {
        System.out.println("[SQLIB] CONNECTING TO DATABASE");
        SqlManager.connectSQLITE(this.directory, this.name);
    }
}