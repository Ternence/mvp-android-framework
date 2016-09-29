package com.mvp.framework.module.base.presenter.ipresenter;

import com.mvp.framework.module.base.model.BaseVolleyModel;
import com.mvp.framework.module.base.model.imodel.IBaseModel;

import org.json.JSONObject;

import java.util.Map;


/**
 * @ClassName: IBasePresenter
 * @author create by Tang
 * @date date 16/8/22 下午5:02
 * @Description: presenter基类
 */
public interface IBasePresenter<T> {

    void accessServer(T params);

    void accessSucceed(JSONObject response);

    Map getParams();

    IBaseModel getModel();

    void cancelRequest();

    void volleyError(int errorCode, String errorDesc, String ApiInterface);
}
