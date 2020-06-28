package com.xs.boot.component;

import com.xs.boot.entity.util.UserEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by FF on 2020/6/27.
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取Session
        HttpSession session = request.getSession();
        UserEntity user = (UserEntity) session.getAttribute("user");

        // 判断Session中是否有用户数据，如果有，则返回true,继续向下执行
        if(user != null){
            //System.out.println("拦截器输出session里面的user:"+user);
            return true;
        }else{
            // 不符合条件的给出提示信息，并转发到登录页面
            System.out.println("拦截器：没有权限！");
            request.setAttribute("msg", "没有权限");
            request.getRequestDispatcher("/login")
                    .forward(request, response);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
