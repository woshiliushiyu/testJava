<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2017/2/6
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="am-modal am-modal-prompt" tabindex="-1" id="my-prompt">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">用户信息修改</div>
        <div class="am-modal-bd">
            <form enctype="multipart/form-data" accept-charset="UTF-8">
                昵称：
                <input type="text" class="am-modal-prompt-input" id="displayName">
                头像：
                <div class="am-modal-prompt-input">
                    <input type="file" name="file" id="changeHeadPic" size="28"/>
                </div>
            </form>
        </div>
        <div class="am-modal-footer">
            <span class="am-modal-btn" data-am-modal-cancel>取消</span>
            <span class="am-modal-btn" data-am-modal-confirm>上传</span>
        </div>
    </div>
</div>
