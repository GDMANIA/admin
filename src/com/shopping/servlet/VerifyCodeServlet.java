package com.shopping.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/user/page_user/getVerifyCode.do")
public class VerifyCodeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//    	System.out.println("VerifyCodeServlet service is invoked");
    	
        // ��֤��ͼƬ�Ŀ�ȡ�
        int width = 70;
        // ��֤��ͼƬ�ĸ߶ȡ�
        int height = 30;
        BufferedImage buffImg = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g = buffImg.createGraphics();

        // ����һ��������������ࡣ
        Random random = new Random();

        // �趨ͼ�񱳾�ɫ(��Ϊ��������������ƫ��)
        g.setColor(getRandColor(200, 250));
        g.fillRect(0, 0, width, height);
        // �������壬����Ĵ�СӦ�ø���ͼƬ�ĸ߶�������
        Font font = new Font("Times New Roman", Font.HANGING_BASELINE, 28);
        // �������塣
        g.setFont(font);

        // ���߿�
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, width - 1, height - 1);
        // �������155�������ߣ�ʹͼ���е���֤�벻�ױ���������̽�⵽��
//g.setColor(Color.GRAY);
        g.setColor(getRandColor(160,200));
        for (int i = 0; i < 155; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            g.drawLine(x, y, x + xl, y + yl);
        }

        // randomCode���ڱ��������������֤�룬�Ա��û���¼�������֤��
        StringBuffer randomCode = new StringBuffer();

        // ����Ĭ������4����֤��
        int length = 4;
        // ���ñ�ѡ��֤��:����"a-z"������"0-9"
        String base = "abcdefghjkmnprstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ2345678";

        int size = base.length();

        // �������4λ���ֵ���֤�롣
        for (int i = 0; i < length; i++) {
            // �õ������������֤�����֡�
            int start = random.nextInt(size);
            String strRand = base.substring(start, start + 1);

            // �������������ɫ����֤����Ƶ�ͼ���С�
// ���������ɫ(��Ϊ����ǰ��������ƫ��)
//g.setColor(getRandColor(1, 100));
            
//���ú�����������ɫ��ͬ����������Ϊ����̫�ӽ�������ֻ��ֱ������
            g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));

            g.drawString(strRand, 15 * i + 6, 24);

            // ���������ĸ�����������һ��
            randomCode.append(strRand);
        }
        // ����λ���ֵ���֤�뱣�浽Session�С�
        HttpSession session = request.getSession();
        session.setAttribute("verifyCode_session", randomCode.toString());

        //ͼ����Ч
        g.dispose();

        // ��ֹͼ�񻺴档
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
       response.setDateHeader("Expires", 0);

       response.setContentType("image/jpeg");

       // ��ͼ�������Servlet������С�
       ServletOutputStream sos = response.getOutputStream();
       ImageIO.write(buffImg, "jpeg", sos);
       sos.flush();
       sos.close();

   }

   Color getRandColor(int fc, int bc) {// ������Χ��������ɫ
       Random random = new Random();
       if (fc > 255)
           fc = 255;
       if (bc > 255)
           bc = 255;
       int r = fc + random.nextInt(bc - fc);
       int g = fc + random.nextInt(bc - fc);
       int b = fc + random.nextInt(bc - fc);
       return new Color(r, g, b);
   }

}
