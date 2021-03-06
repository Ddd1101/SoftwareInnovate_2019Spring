package com.nju.coursework.saas.logic.service;

import com.nju.coursework.saas.logic.vo.GroupsVO;
import com.nju.coursework.saas.web.response.GeneralResponse;

import java.io.InputStream;
import java.util.List;

/**
 * Created by zhouxiaofan on 2017/11/8.
 */
public interface GroupService {

    /**
     * 创建学生群组
     *
     * @param userId    创建者id
     * @param excel     excel文件在resources下路径
     * @param groupName 群组名，一般为班级或者年级名
     * @return
     */
    GeneralResponse createGroup(int userId, InputStream excel, String groupName);

    /**
     * 获取用户所有群组
     *
     * @param userId
     * @return
     */
    List<GroupsVO> getGroups(int userId);

}
