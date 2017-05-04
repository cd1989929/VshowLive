package com.weshow.live.user.contract;


import com.tbruyelle.rxpermissions.RxPermissions;
import com.weshow.live.basemodule.base.DefaultAdapter;
import com.weshow.live.basemodule.mvp.BaseView;
import com.weshow.live.basemodule.mvp.IModel;
import com.weshow.live.user.model.entity.User;

import java.util.List;

import rx.Observable;

/**
 * Created by jess on 9/4/16 10:47
 * Contact with jess.yan.effort@gmail.com
 */
public interface UserContract {
    //对于经常使用的关于UI的方法可以定义到BaseView中,如显示隐藏进度条,和显示文字消息
    interface View extends BaseView {
        void setAdapter(DefaultAdapter adapter);
        void startLoadMore();
        void endLoadMore();
        //申请权限
        RxPermissions getRxPermissions();
    }
    //Model层定义接口,外部只需关心model返回的数据,无需关心内部细节,及是否使用缓存
    interface Model extends IModel {
        Observable<List<User>> getUsers(int lastIdQueried, boolean update);
    }
}
