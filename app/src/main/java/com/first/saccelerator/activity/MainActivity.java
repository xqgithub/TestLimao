/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.first.saccelerator.activity;

import android.app.Activity;
import android.os.Bundle;

import com.first.saccelerator.R;
import com.first.saccelerator.base.BaseActivity;

/*
 * TV主页
 */
public class MainActivity extends BaseActivity {

    private Activity mActivity;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    /**
     * 初始化控件
     */
    public void initView() {
        mActivity = MainActivity.this;
    }

    /**
     * 初始化数据
     */
    public void initData() {
    }

    @Override
    protected void initListener() {

    }
}
