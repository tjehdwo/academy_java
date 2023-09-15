package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		//�̹��� �ϳ� �ҷ�����
		//����ȭ�鿡 ���ο� ���� ����� mkdir
		//���� ���������� �̹��� ����ȭ�鿡 ���� ���� �����ȿ� �����ϱ�
		String fdPath = "C:\\Users\\user1\\Desktop\\ResizeFolder\\";
		File fd = new File(fdPath);
		if(!fd.exists()) {
			fd.mkdir();
			System.out.println("������ �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "cute.png";
		String outputImg = fdPath + "RScute.png";
		
		int width = 500;
		int height = 500;
		
		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			BufferedImage bufResizeImg = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0, null);
			
			ImageIO.write(bufResizeImg, "png",new File(outputImg));
			System.out.println("�̹��� �������� �Ϸ�!!!!");
		} catch (IOException e) {
			System.out.println("�̹��� �������� �� ���� �߻�!" + e.getMessage());
		
		}
		
	}

}
