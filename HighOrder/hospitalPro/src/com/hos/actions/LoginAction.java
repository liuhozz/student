/**
 * 
 */
package com.hos.actions;
import java.util.List;

import javax.swing.JOptionPane;

import com.hos.beans.Login_user;
import com.hos.serviceDao.ServiceUser;
import com.hos.serviceImp.ServiceUserimp;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @djp
 *
 */
public class LoginAction  extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String username; //用户名
    private String password; //密码
    ServiceUser s = new ServiceUserimp();
    Login_user user=new Login_user();
 	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginAction() {
		// TODO Auto-generated constructor stub
	}
   @Override
    public String execute() throws Exception {
	   List<Login_user > user= s.find(username, password);
	   if(!user.isEmpty()){
		   
	       return "loginsuccess";
	       }
	   else{
		    
		     this.addActionMessage("用户名或密码错误");
	         return "loginerror";
	    }
	   
   }
   public String save(){
	  
	   Boolean bool= s.save(user, username, password);
	   if(bool){
	       return "savesuccess";
	       }
	   else{
	         return "saveerror";
	    }
	   
	   
   }
}
