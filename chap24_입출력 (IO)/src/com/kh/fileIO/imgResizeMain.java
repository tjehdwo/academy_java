package com.kh.fileIO;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class imgResizeMain {

	public static void main(String[] args) {
		//���� �̹��� ���� ��� �����ϰ� �̹��� ���������� ���� ��� ����
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "cute.png";
		String outputImg = path + "reSizeCute.png";
		
		// ���������� �̹��� ũ�� ����
		int width = 1000; //���� ����
		int height = 800;//���� ����
		
		try {
			//���� �̹����� �о����
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			
			//���ο� ũ��� �̹��� ��������
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			//BufferedImage ��ȯ
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);
			//�������� �� �̹����� ���Ϸ� �����ϱ�
			ImageIO.write(bufResizeImg,"png",new File(outputImg));
			
			System.out.println("�̹��� �������� �Ϸ�!");
		} catch (IOException e) {
			System.out.println("�̹��� �� �������� ���� �߻�!" + e.getMessage());
		
		}
	}

}
