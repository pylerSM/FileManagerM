package com.pyler.m.filemanager;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;

public class FileManagerM extends Activity {
    public static final String ACTION_BROWSE_DOCUMENT_ROOT = "android.provider.action.BROWSE_DOCUMENT_ROOT";
    private static final String DOCUMENT_AUTHORITY = "com.android.externalstorage.documents";
    private static final String DOCUMENT_ROOT_PRIMARY_EMULATED = "primary";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Uri uri = DocumentsContract.buildRootUri(DOCUMENT_AUTHORITY,
                DOCUMENT_ROOT_PRIMARY_EMULATED);
        Intent intent = new Intent(ACTION_BROWSE_DOCUMENT_ROOT);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        intent.setData(uri);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}
