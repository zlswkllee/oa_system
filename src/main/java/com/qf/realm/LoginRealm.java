package com.qf.realm;

import com.qf.pojo.Role;
import com.qf.service.AuthoService;
import com.qf.service.LoginService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class LoginRealm extends AuthorizingRealm {
    @Autowired
    private LoginService loginService;
    @Autowired
    private AuthoService authoService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("%%%%%%%%%%%%%%%%%%%");
        String primaryPrincipal = (String)principalCollection.getPrimaryPrincipal();
        List<Role> roles = authoService.getRolesByUid(primaryPrincipal);
        List<String> roleName = new ArrayList<String>();
        for(Role role:roles){
            roleName.add(role.getRolename());
        }
        List<String> permission = authoService.getPermission(roles);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRoles(roleName);
        simpleAuthorizationInfo.addStringPermissions(permission);
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String principal = (String) authenticationToken.getPrincipal();
        String[] split = principal.split(":");
        String password = loginService.getPassword(principal);

        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(principal, password, "LoginRealm");

        return simpleAuthenticationInfo;
    }
}
