package util.image;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;

public class ThumbImage {
	public static void makeThumb(int width, int height, 
			File srcFile, File thumbFile) throws IOException {
		BufferedImage src_image = ImageIO.read(srcFile);
		BufferedImage thumb_image = new BufferedImage(width, height,
				BufferedImage.TYPE_3BYTE_BGR);

		Graphics2D graphic = thumb_image.createGraphics();
		graphic.drawImage(src_image, 0, 0, width, height, null);
		ImageIO.write(thumb_image, "jpg", thumbFile);
	}
} 
