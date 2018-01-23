package com.json.itdaily.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.json.itdaily.R;
import com.json.itdaily.adapter.RealmAdapter;
import com.json.itdaily.realmbean.MobilePhone;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.realm.Realm;
import io.realm.RealmAsyncTask;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;

/**
 * RealmSql数据库
 * Created by Json on 2018/1/22.
 */

public class RealmSql extends Activity {
    Realm mRealm;
    @Bind(R.id.realm_list)
    ListView realmList;
    private RealmAsyncTask addTask;
    private RealmResults<MobilePhone> queryAsync;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realm);
        ButterKnife.bind(this);
        mRealm = Realm.getDefaultInstance();

        for (int i = 0; i < 10; i++) {
            MobilePhone mobilePhone = new MobilePhone();
            mobilePhone.setId(String.valueOf(i));
            mobilePhone.setName("Le X820");
            mobilePhone.setPrice(1080);
            asyncAdd(mobilePhone);
        }
        asyncQuery();


    }

    /**
     * Realm数据库的异步增
     *
     * @param mobilePhone
     */
    private void asyncAdd(final MobilePhone mobilePhone) {
        addTask = mRealm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.copyToRealm(mobilePhone);
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                Toast.makeText(RealmSql.this, "成功", Toast.LENGTH_SHORT).show();

            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                Toast.makeText(RealmSql.this, "失败", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 异步查
     */
    private void asyncQuery() {
        queryAsync = mRealm.where(MobilePhone.class).findAllAsync();
        queryAsync.addChangeListener(new RealmChangeListener<RealmResults<MobilePhone>>() {

            @Override
            public void onChange(RealmResults<MobilePhone> element) {
                ArrayList<MobilePhone> list = (ArrayList<MobilePhone>) mRealm.copyFromRealm(element.sort("id"));
                RealmAdapter adapter = new RealmAdapter(list);
                realmList.setAdapter(adapter);
                for (int i = 0; i < list.size(); i++) {
                    Log.e("tag", list.get(i).getId() + list.get(i).getName() + list.get(i).getPrice());
                }
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (addTask != null && !addTask.isCancelled()) {
            addTask.cancel();
        }
        queryAsync.removeAllChangeListeners();
    }
}
