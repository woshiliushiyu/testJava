<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2017/2/6
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="left-sidebar">
    <!-- 用户信息 -->
    <div class="tpl-sidebar-user-panel">
        <div class="tpl-user-panel-slide-toggleable">
            <div class="tpl-user-panel-profile-picture">
                <img src="<c:url value="/static/images/user04.png"/>" alt="">
            </div>
            <span class="user-panel-logged-in-text">
              <i class="am-icon-circle-o am-text-success tpl-user-panel-status-icon"></i>
              ${displayName}
          </span>
            <a href="javascript:changeUserInfo();" class="tpl-user-panel-action-link"> <span
                    class="am-icon-pencil"></span> 账号设置</a>
        </div>
    </div>

    <!-- 菜单 -->
    <ul class="sidebar-nav">
        <li class="sidebar-nav-heading">Core <span class="sidebar-nav-heading-info"> 核心功能</span></li>
        <li class="sidebar-nav-link">
            <a href="/endSupport/index" id="menu-go-index">
                <i class="am-icon-home sidebar-nav-link-logo"></i> 首页
            </a>
        </li>
        <shiro:hasPermission name="文章中心">
            <li class="sidebar-nav-link">
                <a href="javascript:;" id="menu-go-post" class="sidebar-nav-sub-title">
                    <i class="am-icon-table sidebar-nav-link-logo"></i> 文章中心
                    <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
                </a>
                <ul class="sidebar-nav sidebar-nav-sub" id="menu-post-ul">
                    <li class="sidebar-nav-link">
                        <a href="<c:url value="/endSupport/editPost"/>" id="menu-edit-post">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 写文章
                        </a>
                    </li>

                    <li class="sidebar-nav-link">
                        <a href="/endSupport/allPost" id="menu-all-post">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 文章列表
                        </a>
                    </li>

                    <li class="sidebar-nav-link">
                        <a href="/endSupport/allTrash" id="menu-all-trash">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 回收站
                        </a>
                    </li>

                    <li class="sidebar-nav-link">
                        <a href="#" id="menu-reedit-post">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 修改文章
                        </a>
                    </li>
                </ul>
            </li>
        </shiro:hasPermission>

        <shiro:hasPermission name="留言管理">

            <li class="sidebar-nav-link">
                <a href="calendar.html">
                    <i class="am-icon-calendar sidebar-nav-link-logo"></i> 留言管理
                </a>
            </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="多媒体管理">
            <li class="sidebar-nav-link">
                <a href="form.html">
                    <i class="am-icon-wpforms sidebar-nav-link-logo"></i> 多媒体管理

                </a>
            </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="API系统">
            <li class="sidebar-nav-link">
                <a href="/apiDocs">
                    <i class="am-icon-bar-chart sidebar-nav-link-logo"></i> API系统

                </a>
            </li>
        </shiro:hasPermission>

        <li class="sidebar-nav-heading">Advance<span class="sidebar-nav-heading-info"> 高级设置</span></li>
        <shiro:hasPermission name="用户管理">
            <li class="sidebar-nav-link">
                <a href="javascript:;" id="menu-go-user" class="sidebar-nav-sub-title">
                    <i class="am-icon-user sidebar-nav-link-logo"></i>用户管理
                    <span class="am-icon-chevron-down am-fr am-margin-right-sm sidebar-nav-sub-ico"></span>
                </a>
                <ul class="sidebar-nav sidebar-nav-sub" id="menu-user-ul">
                    <li class="sidebar-nav-link">
                        <a href="/endSupport/allUser" id="menu-all-user">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 用户列表
                        </a>
                    </li>

                    <li class="sidebar-nav-link">
                        <a href="/endSupport/addUser" id="menu-add-user">
                            <span class="am-icon-angle-right sidebar-nav-link-logo"></span> 增加用户
                        </a>
                    </li>
                </ul>
            </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="微信管理">
            <li class="sidebar-nav-link">
                <a href="sign-up.html">
                    <i class="am-icon-clone sidebar-nav-link-logo"></i> 微信管理
                    <span class="am-badge am-badge-secondary sidebar-nav-link-logo-ico am-round am-fr am-margin-right-sm">6</span>
                </a>
            </li>
        </shiro:hasPermission>
        <shiro:hasPermission name="服务器中心">
            <li class="sidebar-nav-link">
                <a href="/serverCenter">
                    <i class="am-icon-key sidebar-nav-link-logo"></i> 服务器中心
                </a>
            </li>
        </shiro:hasPermission>
        <li class="sidebar-nav-link">
            <a href="404.html">
                <i class="am-icon-tv sidebar-nav-link-logo"></i> 404错误
            </a>
        </li>

    </ul>
</div>
