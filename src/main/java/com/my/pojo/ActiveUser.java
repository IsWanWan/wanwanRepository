package com.my.pojo;

/**
 * Created by wanwan on 16/7/18.
 */
public class ActiveUser {



        private Integer userid;//用户id（主键）
        private String usercode;// 用户账号
        private String username;// 用户名称

//        private List<SysPermission> menus;// 菜单
//        private List<SysPermission> permissions;// 权限

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }


        public String getUsercode() {
            return usercode;
        }

        public void setUsercode(String usercode) {
            this.usercode = usercode;
        }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    //        public List<SysPermission> getMenus() {
//            return menus;
//        }
//
//        public void setMenus(List<SysPermission> menus) {
//            this.menus = menus;
//        }
//
//        public List<SysPermission> getPermissions() {
//            return permissions;
//        }
//
//        public void setPermissions(List<SysPermission> permissions) {
//            this.permissions = permissions;
//        }




}
