package imageHandling;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ConvertImageFormat {

	public static void main(String[] args) {
		convertUsingBufferedImage("/Users/karthick-9046/Downloads/animals-4.jpg");

	}
	
	public static void convertUsingBufferedImage(String path) {
		
		File file = new File(path);
		try {
			BufferedImage image = ImageIO.read(file);
			
			ImageIO.write(image, "png", new File("/Users/karthick-9046/Downloads/animals.png"));
			ImageIO.write(image, "gif", new File("/Users/karthick-9046/Downloads/animals.gif"));
			ImageIO.write(image, "bmp", new File("/Users/karthick-9046/Downloads/animals.bmp"));
			ImageIO.write(image, "pdf", new File("/Users/karthick-9046/Downloads/animals.pdf"));

			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
