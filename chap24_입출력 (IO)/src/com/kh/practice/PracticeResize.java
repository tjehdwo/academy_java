package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		//이미지 하나 불러오기
		//바탕화면에 새로운 폴더 만들기 mkdir
		//새로 리사이즈한 이미지 바탕화면에 새로 만든 폴더안에 저장하기
		String fdPath = "C:\\Users\\user1\\Desktop\\ResizeFolder\\";
		File fd = new File(fdPath);
		if(!fd.exists()) {
			fd.mkdir();
			System.out.println("폴더가 생성되었습니다.");
		}else {
			System.out.println("폴더가 이미 존재합니다.");
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
			System.out.println("이미지 리사이즈 완료!!!!");
		} catch (IOException e) {
			System.out.println("이미지 리사이즈 중 오류 발생!" + e.getMessage());
		
		}
		
	}

}
