/**
 * 
 */
package com.hos.actions;

import java.io.File;

import javax.swing.JOptionPane;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 *
 */
public class upload extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public upload() {
		// TODO Auto-generated constructor stub
	}
	private File image; //�ϴ����ļ�
    private String imageFileName; //�ļ�����
    private String imageContentType; //�ļ�����

	public String execute() throws Exception {
        String realpath = ServletActionContext.getServletContext().getRealPath("/WebRoot/ImgVedio/image");
        //D:\apache-tomcat-6.0.18\webapps\struts2_upload\images

        System.out.println("realpath: "+realpath);
        System.out.println("name: "+image.getName());
        if (image.isFile()) {
            //File savefile = new File(new File(realpath), imageFileName);
            File savefile= new File(new File(realpath), "�˽���.jpg");
            System.out.println(savefile);
          
            FileUtils.copyFile(image, savefile);
            ActionContext.getContext().put("message", "�ļ��ϴ��ɹ�");
            return "success";
        }
        else{
        	return "error";
        }
        
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(String imageContentType) {
        this.imageContentType = imageContentType;
    }

    

}
