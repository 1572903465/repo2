package edu.sicnu.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/LastAccess")
public class LastAccess extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");//设置服务器输出内容的编码方式
        String lastAccessTime=null;
        Cookie[] cookies =request.getCookies();
        Cookie cookie=getCookie(cookies,"lastTime" );
        //判断是否有lastTime这个name的Cookie对象
        if(cookie == null){
            //判断成功，说明没有上次访问时间的那个Cookie，这时候创建Cookie独享，保存本次的时间
            response.getWriter().write("您是首次访问本站！！！");
            cookie =new Cookie("lastTime",System.currentTimeMillis()+"");
        }else {
            //程序进入到else中，说明上次访问时间的Cookie信息，获取到这个数据
            String value =cookie.getValue();
            //将数据写到客户端
            response.getWriter().write("您上次访问的时间是："+value);
            //将本次的时间重新写给Cookie中
            cookie.setValue(System.currentTimeMillis()+"");
        }
        //最后将本次cookie添加到Response中，写给客户端
        cookie.setMaxAge(60);
        response.addCookie(cookie);
    }
    /*
    定义一个方法，专门来获取指定那么的cookie对象
     */
    private Cookie getCookie(Cookie[] cookies,String name ){
        //遍历数据
        if(cookies == null){
            return null;
        }
        for(Cookie c:cookies){
            //每个Cookie都有自己的name，取出和指定的name判断
            if(c.getName().equals(name)){
                return c;
            }
        }
        //用户的访问中的确有，但是没有指定name的Cookie对象
        return null;
    }
}
