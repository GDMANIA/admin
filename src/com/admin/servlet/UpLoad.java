package com.admin.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



@WebServlet("/admin/image.do")

public class UpLoad extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		// Ϊ�������ṩ������Ϣ
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// �����������ʵ��
		ServletFileUpload sfu = new ServletFileUpload(factory);
		// ��ʼ����
		sfu.setFileSizeMax(1024 * 400);
		// ÿ�����������ݻ��װ��һ����Ӧ��FileItem������
		try {
			//���ܻ����  input type="text"      input type="password"   input type="file"
			List<FileItem> items = sfu.parseRequest(req);
			// ���ֱ���
			for (int i = 0; i < items.size(); i++) {
				FileItem item = items.get(i);
				// isFormFieldΪtrue����ʾ�ⲻ���ļ��ϴ�����
				if (!item.isFormField()) {
					ServletContext sctx = getServletContext();
					// ��ô���ļ�������·��
					// upload�µ�ĳ���ļ��� �õ���ǰ���ߵ��û� �ҵ���Ӧ���ļ���

					//String path = sctx.getRealPath("");
					//System.out.println(path);
					// ����ļ���
					String fileName = item.getName();
					System.out.println(fileName);
					// �÷�����ĳЩƽ̨(����ϵͳ),�᷵��·��+�ļ���
					
					fileName = fileName.substring(fileName.lastIndexOf("/") + 1);
					
					//File file = new File(path + "\\" + fileName);
					
					File file = new File("D:\\hua\\apache-tomcat-7.0.69\\webapps\\admin"+ "\\" +"admin\\img\\"+"shopping_logo.png");
					if (!file.exists()) {
						System.out.println(file);
						
						item.write(file);
						// ���ϴ�ͼƬ�����ּ�¼�����ݿ���
					
						/*
						 * //�ֶ�д�� OutputStream out = new FileOutputStream(new File(path,filename));
						 * InputStream in = item.getInputStream() ;
						 * int length = 0 ; 
						 * byte [] buf = new byte[1024] ;
						 * System.out.println("��ȡ�ϴ��ļ����ܹ���������"+item.getSize());
						 * // in.read(buf) ÿ�ζ��������ݴ���� buf ������
						 * while( (length =in.read(buf) ) != -1) { //�� buf ������ ȡ������ д�� ���������������
						 * 	out.write(buf, 0, length);
						 * }
						 * in.close(); 
						 * out.close();
						 */
						
						resp.sendRedirect("/upload/ok.html");
					}else{
						item.write(file);
						System.out.println("�����ļ��ɹ�");
						resp.sendRedirect("/upload/ok.html");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}