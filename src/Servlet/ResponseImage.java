package Servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseImage
 */
@WebServlet("/ResponseImage")
public class ResponseImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponseImage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//输出的内容类型为jpg
		response.setContentType("image/jpeg");
		//在内存中创建一张图片
				BufferedImage image=new BufferedImage(70,30,BufferedImage.TYPE_INT_BGR);
				Graphics g =image.getGraphics();
				//设置背景
				g.setColor(Color.blue);
				g.fillRect(0, 0, 70, 30);
				
				g.setColor(Color.white);
				g.setFont(new Font(null,Font.BOLD,24));
				Random random=new Random();
				int VCName=random.nextInt(8999)+1000;
				String vcode =String.valueOf(VCName);
				
				g.drawString(vcode,10,25);
				
				//获取输出文件
				OutputStream os=response.getOutputStream();
				ImageIO.write(image,"jpg",os);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
