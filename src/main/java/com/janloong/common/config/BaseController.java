/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
 : Copyright (c) 2019  All Rights Reserved.
 : ProjectName: SpringCloud
 : FileName: BaseController.java
 : Author: janloongdoo@gmail.com
 : Date: 19-5-20 上午11:37
 : LastModify: 18-10-16 上午9:26
 :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/

package com.janloong.common.config;


import javax.annotation.Resource;

/**
 * 基础controller类
 *
 * @author <a href ="https://blog.janloong.com">Janloong Doo</a>
 * @version V1.0
 * @since 2018-03-20 15:16
 */
public abstract class BaseController<Service> {
    private Service Service;

    public Service getService() {
        if (Service == null) {
            synchronized (this) {
                if (Service == null) {
                    setService(Service);
                }
            }
        }
        return Service;
    }

    @Resource
    public void setService(Service Service) {
        this.Service = Service;
    }
}
